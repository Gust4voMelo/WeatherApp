package ui.nav

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.NavHostController
import com.weatherapp.HomePage
import com.weatherapp.ListPage
import com.weatherapp.MapPage
import com.weatherapp.ui.nav.Route

@Composable
fun MainNavHost(navController: NavHostController) {
    NavHost(navController, startDestination = Route.Home) {
        composable<Route.Home> { HomePage() }
        composable<Route.List> { ListPage() }
        composable<Route.Map>  { MapPage() }
    }
}
