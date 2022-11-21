package com.example.Grupo_10_Indumentaria.Config;

import com.example.Grupo_10_Indumentaria.Entidades.Auditorias.Revision;
import org.hibernate.envers.RevisionListener;

public class CustomRevisionListener implements RevisionListener {
    public void newRevision (Object revisionEntity){
        final Revision revision = (Revision) revisionEntity;
    }
}
