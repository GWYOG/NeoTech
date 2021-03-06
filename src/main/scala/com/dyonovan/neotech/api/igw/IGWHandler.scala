package com.dyonovan.neotech.api.igw

import igwmod.api.WikiRegistry

/**
  * This file was created for NeoTech
  *
  * NeoTech is licensed under the
  * Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License:
  * http://creativecommons.org/licenses/by-nc-sa/4.0/
  *
  * @author Dyonovan
  * @since 1/23/2016
  */
object IGWHandler {

    def init(): Unit = {
        WikiRegistry.registerWikiTab(new NeotechTab)
    }

}
