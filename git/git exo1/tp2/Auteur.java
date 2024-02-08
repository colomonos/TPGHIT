public class Auteur{

    private String nom;
    private int performance_tragédie; // 0 et 100
    private int performance_comédie; // 0 et 100
    private int performance_drame;// 0 et 100
    private String citationt;
    private String citationc;
    private String citationd;

    public Auteur(String nom,int tragédie,String citation1,int comédie,String citation2,int drame,String citation3){
        this.nom =nom;
        this.performance_tragédie =tragédie;
        this.performance_comédie =comédie;
        this.performance_drame =drame;
        this.citationt =citation1;
        this.citationc =citation2;
        this.citationd =citation3;
    }
    
    public int getQualitéTragédie(){
        return this.performance_tragédie;
    }

    public String getCitationTragédie(){
        return this.citationt;
    }


    public int getQualitéComédie(){
        return this.performance_comédie;
    }

    public String getCitationComédie(){
        return this.citationc;
    }

    public int getQualitéDrame(){
        return this.performance_drame;
    }

    public String getCitationDrame(){
        return this.citationd;
    }

    /*public String getMeilleurCitation(){
        if ((this.performance_tragédie - this.performance_comédie)<0){
            if ((this.performance_drame - this.performance_comédie)<0){
                return "comédie";
            }
        }
        if ((this.performance_comédie - this.performance_drame)<0){
            if ((this.performance_tragédie - this.performance_drame)<0){
                    return "drame";
            }
        }
        if ((this.performance_drame - this.performance_tragédie)<0){
            if ((this.performance_comédie - this.performance_tragédie)<0){
                    return "tragédie";
            }
        }   
        return "";
        }
*/
    public String pointFort(){}



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