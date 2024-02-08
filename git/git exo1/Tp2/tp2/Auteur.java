public class Auteur{

    private String nom;
    private int performance_tragedie; // 0 et 100
    private int performance_comedie; // 0 et 100
    private int performance_drame;// 0 et 100
    private String citationt;
    private String citationc;
    private String citationd;

    public Auteur(String nom,int tragedie,String citation1,int comedie,String citation2,int drame,String citation3){
        this.nom =nom;
        this.performance_tragedie =tragedie;
        this.performance_comedie =comedie;
        this.performance_drame =drame;
        this.citationt =citation1;
        this.citationc =citation2;
        this.citationd =citation3;
    }
    
    public int getQualiteTragedie(){
        return this.performance_tragedie;
    }

    public String getCitationTragedie(){
        return this.citationt;
    }


    public int getQualitecomedie(){
        return this.performance_comedie;
    }

    public String getCitationcomedie(){
        return this.citationc;
    }

    public int getQualitéDrame(){
        return this.performance_drame;
    }

    public String getCitationDrame(){
        return this.citationd;
    }

    public String getMeilleurCitation(){
        if ((this.performance_tragedie - this.performance_comedie)<0){
            if ((this.performance_drame - this.performance_comedie)<0){
                return "comedie";
            }
        }
        if ((this.performance_comedie - this.performance_drame)<0){
            if ((this.performance_tragedie - this.performance_drame)<0){
                    return "drame";
            }
        }
        if ((this.performance_drame - this.performance_tragedie)<0){
            if ((this.performance_comedie - this.performance_tragedie)<0){
                    return "tragedie";
            }
        }   
        return "";
        }

public String citationStyle(){
    if ((this.performance_tragedie - this.performance_comedie)<0){
            if ((this.performance_drame - this.performance_comedie)<0){
                return citationc;
            }
        }
        if ((this.performance_comedie - this.performance_drame)<0){
            if ((this.performance_tragedie - this.performance_drame)<0){
                    return citationd;
            }
        }
        if ((this.performance_drame - this.performance_tragedie)<0){
            if ((this.performance_comedie - this.performance_tragedie)<0){
                    return citationt;
            }
        }   
        return "";
        }
        

@Override
public String toString(){
     
    String s1 = "L'honorable ";
    return s1.concat(this.nom);
      

}





}


/*

class Auteur{
    Map<String,Perfformance> perfs;

    public Auteur(){
        this.perfss = new HashMap<>();
        this.perfs.put("DRAME",new Performance("blabla",100));

        String citationDrame = this.perfs.get("DRAME").getCitation
        Integer dramePerf = this.perf.get("DRAME").getQualite()
    }
}

public Auteur(){
    this.perfComedie = HashMap<>();
    this.perfDrame = HashMap<>();
    this.perfDrame.put("blbalablaDrame",100);
    this.perfComedie.put("blbalablacomedie",100);

    String drameCitation = this.perfDrame.keyset()[0];
    Integer drameQualite = this.perfDrame.values()[0]
}

*/