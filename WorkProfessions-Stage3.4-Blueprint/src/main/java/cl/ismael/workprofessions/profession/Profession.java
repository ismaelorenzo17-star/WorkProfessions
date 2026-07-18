package cl.ismael.workprofessions.profession;
public class Profession{
 private final ProfessionType type; private int level=1; private int xp=0;
 public Profession(ProfessionType t){this.type=t;}
 public ProfessionType getType(){return type;}
 public int getLevel(){return level;}
 public int getXp(){return xp;}
 public void addXp(int amount){xp+=amount; while(xp>=level*100){xp-=level*100;level++;}}
}
