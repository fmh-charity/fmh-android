package ru.iteco.fmhandroid.ui

import android.os.Bundle
import android.view.View
import android.widget.PopupMenu
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import ru.iteco.fmhandroid.R
import ru.iteco.fmhandroid.databinding.FragmentWishListBinding
import ru.iteco.fmhandroid.viewmodel.WishViewModel

class WishListFragment : Fragment(R.layout.fragment_wish_list) {
    private lateinit var binding: FragmentWishListBinding
    private val viewModel: WishViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentWishListBinding.bind(view)

        val mainMenu = PopupMenu(
            context,
            binding.containerCustomAppBarIncludeOnFragmentWish.mainMenuImageButton
        )
        mainMenu.inflate(R.menu.menu_main)
        val menuItemMain = mainMenu.menu.getItem(4)
        menuItemMain.isEnabled = false
        binding.containerCustomAppBarIncludeOnFragmentWish.mainMenuImageButton.setOnClickListener {
            mainMenu.show()
        }

        mainMenu.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.menu_item_main -> {
                    findNavController().navigate(R.id.action_wishListFragment_to_mainFragment)
                    true
                }
                R.id.menu_item_claims -> {
                    findNavController().navigate(R.id.action_wishListFragment_to_claimListFragment)
                    true
                }
                R.id.menu_item_news -> {
                    findNavController().navigate(R.id.action_wishListFragment_to_newsListFragment)
                    true
                }
                R.id.menu_item_about -> {
                    findNavController().navigate(R.id.action_wishListFragment_to_aboutFragment)
                    true
                }
                R.id.menu_item_patient -> {
                    findNavController().navigate(R.id.action_wishListFragment_to_patientListFragment)
                    true
                }
                else -> {
                    false
                }
            }
        }

        binding.containerCustomAppBarIncludeOnFragmentWish.ourMissionImageButton.setOnClickListener {
            findNavController().navigate(R.id.action_wishListFragment_to_our_mission_fragment)
        }

        val authorizationMenu = PopupMenu(
            context,
            binding.containerCustomAppBarIncludeOnFragmentWish.authorizationImageButton
        )
        authorizationMenu.inflate(R.menu.authorization)

        binding.containerCustomAppBarIncludeOnFragmentWish.authorizationImageButton.setOnClickListener {
            authorizationMenu.show()
        }

        binding.createNewWishMaterialButton.setOnClickListener {
            findNavController().navigate(R.id.action_wishListFragment_to_createWishFragment)
        }
        binding.filtersMaterialButton.setOnClickListener {
            findNavController().navigate(R.id.action_wishListFragment_to_filterWishListFragment)
        }
    }
}
