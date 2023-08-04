package pucrio.br.lac.logic;

import eu.larkc.csparql.cep.api.RdfQuadruple;
import pucrio.br.lac.model.dscep.TriplesBlock;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MessageTranslator {
    public String translateMessage(ArrayList<TriplesBlock> messages){
        for (int i = 0; i < messages.size(); i++) {
            TriplesBlock messageBlock = messages.get(i);
            List<RdfQuadruple> triples = messageBlock.getTriples();

            Iterator<RdfQuadruple> iterator = triples.iterator();

            while(iterator.hasNext())
            {
                iterator.next().getSubject();
                System.out.println();
                iterator.next().getPredicate();
                iterator.next().getObject();
            }

            Long timestamp = messageBlock.getTimestamp();
        }

        return "";
    }
}
