package utils;

import com.fizzed.ninja.rocker.DefaultNinjaRocker;

import ninja.utils.NinjaConstant;

public class NinjaStarterRocker {
    
    private final DefaultNinjaRocker N;
   
    public final String applicationName;
 

    public NinjaStarterRocker(DefaultNinjaRocker N) {
        this.N = N;
        this.applicationName = N.getNinjaProperties().getOrDie(NinjaConstant.applicationName);
       
    }
}
