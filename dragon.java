public class Dragon 
{
    private String atk;
    private int lvl;
    
    // Write the constructor here!
    public Dragon(int level, String attack){
        this.lvl = level;
        this.atk = attack;
    }
    // Put getters here
    public String getAttack(){
        return atk;
    }
    public int getLevel(){
        return lvl;
    }
    // Put other methods here
    public String fight(){
        String result = "";
        for(int i = 0; i < lvl; i++){
            result += atk;
        }
        return result;
    }

    // String representation of the object
    public String toString()
    {
        return "Dragon is at level " + lvl + " and attacks with " + atk;
    }
}