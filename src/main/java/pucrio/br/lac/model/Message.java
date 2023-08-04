package pucrio.br.lac.model;

import eu.larkc.csparql.cep.api.RdfQuadruple;

import java.util.List;

public class Message {
    private String _id;
    private String _producer;
    private boolean _isRDFgraph;
    private List<RdfQuadruple> _triples;

    public Message(String DSCEPString){

    }


    public String getID(){
        return this._id;
    }

    public void setID(String ID){
        this._id = ID;
    }

    public String getProducer(){
        return this._producer;
    }

    public void setProducer(String producer){
        this._producer = producer;
    }

    public boolean getIsRDFgraph(){
        return this._isRDFgraph;
    }

    public void setIsRDFgraph(boolean isRDFgraph){
        this._isRDFgraph = isRDFgraph;
    }

    public List<RdfQuadruple> getNome(){
        return this._triples;
    }

    public void setNome(List<RdfQuadruple> triples){
        this._triples = triples;
    }

    public String toString(){
        return "ID { " + _id + " } || Producer { " + _producer + " } || RDF { " + _isRDFgraph + " } || " +
                "Triples { " + _triples + " }";
    }
}
