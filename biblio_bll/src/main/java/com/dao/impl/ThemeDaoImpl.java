package com.dao.impl;

import com.bo.Theme;
import com.boudaa.dao.impl.GenericDaoImpl;
import com.dao.ThemeDao;

/**
 * Implémentation du DAO ThemeDao. Cette classe hérite toutes les
 * fonctionnalités du DAO Generic en indiquant les valeurs de T et PK
 * 
 * @author boudaa
 *
 */
public class ThemeDaoImpl extends GenericDaoImpl<Theme, Long> implements
        ThemeDao {

    public ThemeDaoImpl() {

        // car on travail sur des objets de la classe Theme, il y a des
        // méthodes
        // hibernate qui auront besoin de cette information cf. le code de
        // generic dao
        super( Theme.class );
    }

}
