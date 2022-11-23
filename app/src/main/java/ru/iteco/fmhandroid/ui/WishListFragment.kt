package ru.iteco.fmhandroid.ui

import android.os.Bundle
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import ru.iteco.fmhandroid.R
import ru.iteco.fmhandroid.adapter.WishListAdapter
import ru.iteco.fmhandroid.databinding.FragmentListWishBinding
import ru.iteco.fmhandroid.viewmodel.AuthViewModel
import ru.iteco.fmhandroid.viewmodel.WishViewModel

@AndroidEntryPoint
class WishListFragment : Fragment(R.layout.fragment_list_wish) {
    private lateinit var binding: FragmentListWishBinding
    private val viewModel: WishViewModel by viewModels()
    private val authViewModel: AuthViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lifecycleScope.launchWhenCreated {
            viewModel.onRefresh()
        }

        lifecycleScope.launchWhenStarted {
            viewModel.wishesLoadException.collect {
                Toast.makeText(
                    requireContext(),
                    R.string.error,
                    Toast.LENGTH_LONG
                ).show()
            }
        }
        lifecycleScope.launchWhenStarted {
            viewModel.wishCommentsLoadExceptionEvent.collectLatest {
                Toast.makeText(
                    requireContext(),
                    R.string.claim_comments_load_error,
                    Toast.LENGTH_LONG
                ).show()
            }
        }

//        lifecycleScope.launch {
//            viewModel.openWishEvent.collectLatest {
//                val action = WishListFragmentDirections
//                    .actionWishListFragmentToOpenWishFragment(it)
//                findNavController().navigate(action)
//            }
//        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentListWishBinding.bind(view)

        val mainMenu = PopupMenu(
            context,
            binding.containerCustomAppBarIncludeOnFragmentListWish.mainMenuImageButton
        )
        mainMenu.inflate(R.menu.menu_main)
        val menuItemMain = mainMenu.menu.getItem(4)
        menuItemMain.isEnabled = false
        binding.containerCustomAppBarIncludeOnFragmentListWish.mainMenuImageButton.setOnClickListener {
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

        binding.containerCustomAppBarIncludeOnFragmentListWish.ourMissionImageButton.setOnClickListener {
            findNavController().navigate(R.id.action_wishListFragment_to_our_mission_fragment)
        }

        val authorizationMenu = PopupMenu(
            context,
            binding.containerCustomAppBarIncludeOnFragmentListWish.authorizationImageButton
        )
        authorizationMenu.inflate(R.menu.authorization)

        binding.containerCustomAppBarIncludeOnFragmentListWish.authorizationImageButton.setOnClickListener {
            authorizationMenu.show()
        }

        binding.containerListWishInclude.createNewWishMaterialButton.setOnClickListener {
            findNavController().navigate(R.id.action_wishListFragment_to_createEditWishFragment)
        }
        binding.containerListWishInclude.filtersMaterialButton.setOnClickListener {
            //TODO фильтр перенесут на бэк. Возможно потом нужно удалить
           //findNavController().navigate(R.id.action_wishListFragment_to_filterWishListFragment)
        }

        /**--------------------------------------------------------------------------------------**/
        binding.apply {
            containerListWishInclude.allWishesTextView.visibility = View.GONE
            containerListWishInclude.expandMaterialButton.visibility = View.GONE
        }
        /**--------------------------------------------------------------------------------------**/

        val adapter = WishListAdapter(viewModel)

        /**--------------------------------------------------------------------------------------**/
        binding.wishListSwipeRefresh.setOnRefreshListener {
            viewModel.onRefresh()
            binding.wishListSwipeRefresh.isRefreshing = false
        }



        binding.containerListWishInclude.filtersMaterialButton.setOnClickListener {
            //TODO фильтр перенесут на бэк. Возможно нужно будет удалить
//            val dialog = WishListFilteringDialogFragment()
//            dialog.show(childFragmentManager, "custom")
        }

        binding.containerCustomAppBarIncludeOnFragmentListWish.mainMenuImageButton.setOnClickListener {
            mainMenu.show()
        }

        binding.containerListWishInclude.createNewWishMaterialButton.setOnClickListener {
            viewLifecycleOwner.lifecycleScope.launch {
                authViewModel.loadUserList()
            }
        }
        binding.containerListWishInclude.wishListRecyclerView.adapter = adapter
    }
}

