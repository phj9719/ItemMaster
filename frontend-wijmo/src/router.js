
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import ItemManager from "./grid/ItemGrid"
import ItemDetail from "./components/listers/ItemDetail"

import ProcessManager from "./grid/ProcessGrid"
import ProcessDetail from "./components/listers/ProcessDetail"

import MaterialManager from "./grid/MaterialGrid"
import MaterialDetail from "./components/listers/MaterialDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/items',
                name: 'ItemManager',
                component: ItemManager
            },
            {
                path: '/items/:id',
                name: 'ItemDetail',
                component: ItemDetail
            },

            {
                path: '/processes',
                name: 'ProcessManager',
                component: ProcessManager
            },
            {
                path: '/processes/:id',
                name: 'ProcessDetail',
                component: ProcessDetail
            },

            {
                path: '/materials',
                name: 'MaterialManager',
                component: MaterialManager
            },
            {
                path: '/materials/:id',
                name: 'MaterialDetail',
                component: MaterialDetail
            },



    ]
})
