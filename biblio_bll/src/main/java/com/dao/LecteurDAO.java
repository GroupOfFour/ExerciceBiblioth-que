package com.dao;

import java.util.List;

import com.bo.Lecteur;
import com.boudaa.dao.GenericDao;
import com.boudaa.dao.exceptions.EntityNotFoundException;

public interface LecteurDAO extends GenericDao<Lecteur, Long> {

    public List<Lecteur> getLecteurByName( String pName ) throws EntityNotFoundException;

}
