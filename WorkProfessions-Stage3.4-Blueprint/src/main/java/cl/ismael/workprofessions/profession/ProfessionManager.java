package cl.ismael.workprofessions.profession;
import java.util.*;
public class ProfessionManager{
 private final Map<ProfessionType,Profession> professions=new EnumMap<>(ProfessionType.class);
 public ProfessionManager(){for(var t:ProfessionType.values()) professions.put(t,new Profession(t));}
 public Profession get(ProfessionType t){return professions.get(t);}
}
