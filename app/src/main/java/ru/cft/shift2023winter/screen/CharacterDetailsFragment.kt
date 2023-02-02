package ru.cft.shift2023winter.screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import coil.load
import ru.cft.shift2023winter.databinding.FragmentCharacterDetailsBinding

class CharacterDetailsFragment : Fragment() {

    private val args by navArgs<CharacterDetailsFragmentArgs>()

    private var _binding: FragmentCharacterDetailsBinding? = null
    private val binding
        get() = checkNotNull(_binding) {
            "Cannot access binding because it is null. Is the view visible?"
        }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentCharacterDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        showCharacterInformation()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun showCharacterInformation() {
        binding.apply {

            args.apply {
                characterImage.load(character.image)

                characterName.text = character.name
                characterStatus.text = character.status

                characterGender.text = character.gender
                characterOrigin.text = character.origin.name

                characterSpecies.text = character.species
                characterType.text = character.type.ifEmpty { EMPTY_TYPE }

                characterLocation.text = character.location.name
            }
        }
    }

    companion object {
        private const val EMPTY_TYPE = "???"
    }
}