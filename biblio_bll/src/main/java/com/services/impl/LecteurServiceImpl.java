package com.services.impl;

import com.bo.Lecteur;
import com.boudaa.dao.exceptions.EntityNotFoundException;
import com.dao.LecteurDAO;
import com.service.LecteurService;

public class LecteurServiceImpl implements LecteurService {

    private LecteurDAO lecteurDao;

    public void addLecteur( Lecteur pLecteur ) {

        // TODO : probabelement du code permettant de vérifier les régles
        // métiers

        lecteurDao.create( pLecteur );

        // TODO : eventuellement du code metier à ajouter

    }

    public void deleteLecteur( Long idLecteur ) throws EntityNotFoundException {

        // TODO : probabelement du code permettant de vérifier les régles
        // métiers

        lecteurDao.delete( idLecteur );

        // TODO : eventuellement du code metier à ajouter

    }

    public void findLecteurByName( String pName ) throws EntityNotFoundException {
        // TODO : probabelement du code permettant de vérifier les régles
        // métiers

        lecteurDao.getLecteurByName( pName );

        // TODO : eventuellement du code metier à ajouter
    }

    public LecteurDAO getLecteurDao() {
        return lecteurDao;
    }

    public void setLecteurDao( LecteurDAO lecteurDao ) {
        this.lecteurDao = lecteurDao;
    }

}
