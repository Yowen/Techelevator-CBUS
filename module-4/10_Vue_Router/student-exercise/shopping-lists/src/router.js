import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/views/Home.vue'
import Products from '@/views/Products.vue'
import WeeklySpecials from '@/views/WeeklySpecials.vue'
import ShoppingCart from '@/views/ShoppingCart.vue'
import Checkout from '@/views/Checkout.vue'
import NotFound from '@/views/NotFound.vue'
import ProductsList from '@/views/ProductsList.vue'

Vue.use(Router)

export default new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    { 
      path: '/',
      name: 'home',
      component: Home
    },
    {
      path: '/products',
      name: 'products',
      component: Products
    },
    {
      path: '/products/:department',
      name: 'products-list',
      component: ProductsList
    },
    {
      path: '/on-sale',
      name: 'weekly-specials',
      component: WeeklySpecials
    },
    {
      path: '/cart',
      name: 'cart',
      component: ShoppingCart
    },
    {
      path: '/checkout',
      name: 'checkout',
      component: Checkout
    }
  ]
})
