/**
 * Created by t00139303 on 05/10/2017.
 */
public class DoughNut {

    private int eggs, flourGrams, yeastGrams, warmWaterMl, milkMl, casterSugarGram, butterGram, afterButterGrams;
    private int vegetableOilMl, icingSugarGrams, hotWaterMl;
    private double vanillaExtractTeaSpoon;

    public int getEggs()
    {
        return eggs;
    }
    public int getFlourGrams()
    {
        return flourGrams;
    }
    public int getYeastGrams()
    {
        return yeastGrams;
    }
    public int getWarmWaterMl()
    {
        return warmWaterMl;
    }
    public int getMilkMl()
    {
        return milkMl;
    }
    public int getCasterSugarGram()
    {
        return casterSugarGram;
    }
    public int getButterGram()
    {
        return butterGram;
    }
    public int getAfterButterGrams()
    {
        return afterButterGrams;
    }
    public int getVegetableOilMl()
    {
        return afterButterGrams;
    }
    public int getIcingSugarGrams()
    {
        return icingSugarGrams;
    }
    public int getHotWaterMl()
    {
        return hotWaterMl;
    }
    public double getVanillaExtractTeaSpoon()
    {
        return vanillaExtractTeaSpoon;
    }
    public void setEggs(int eggs)
    {
        this.eggs = eggs;
    }
    public void setFlourGrams(int flourGrams)
    {
        this.flourGrams = flourGrams;
    }
    public void setYeastGrams(int yeastGrams)
    {
        this.yeastGrams = yeastGrams;
    }
    public void setWarmWaterMl(int warmWaterMl)
    {
        this.warmWaterMl = warmWaterMl;
    }
    public void setMilkMl(int milkMl)
    {
        this.milkMl = milkMl;
    }
    public void setCasterSugarGram(int casterSugarGram)
    {
        this.casterSugarGram = casterSugarGram;
    }
    public void setButterGram(int butterGram)
    {
        this.butterGram = butterGram;
    }
    public void setAfterButterGrams(int afterButterGrams)
    {
        this.afterButterGrams = afterButterGrams;
    }
    public void setVegetableOilMl(int vegetableOilMl)
    {
        this.vegetableOilMl = vegetableOilMl;
    }
    public void setIcingSugarGrams(int icingSugarGrams)
    {
        this.icingSugarGrams = icingSugarGrams;
    }
    public void setHotWaterMl(int hotWaterMl)
    {
        this.hotWaterMl = hotWaterMl;
    }
    public void setVanillaExtractTeaSpoon(double vanillaExtractTeaSpoon)
    {
        this.vanillaExtractTeaSpoon = vanillaExtractTeaSpoon;
    }

    public DoughNut(int eggs, int flourGrams, int yeastGrams, int warmWaterMl, int milkMl, int casterSugarGram, int butterGram,
                    int afterButterGrams, int vegetableOilMl, int icingSugarGrams, int hotWaterMl,
                    double vanillaExtractTeaSpoon)
    {
        setEggs(eggs);
        setFlourGrams(flourGrams);
        setYeastGrams(yeastGrams);
        setWarmWaterMl(warmWaterMl);
        setMilkMl(milkMl);
        setCasterSugarGram(casterSugarGram);
        setButterGram(butterGram);
        setAfterButterGrams(afterButterGrams);
        setVegetableOilMl(vegetableOilMl);
        setIcingSugarGrams(icingSugarGrams);
        setHotWaterMl(hotWaterMl);
        setVanillaExtractTeaSpoon(vanillaExtractTeaSpoon);
    }

    public DoughNut()
    {
        this(0,0,0,0,0,0,0,0,
                0,0,0,0.0);
    }

    public String toString()
    {
        String doughnutText="";

        return doughnutText;
    }

    public static boolean enoughEggs(int eggs)
    {
        int perfect = 2;

        if(eggs==perfect)
            return true;
        else
            return false;
    }

    public static boolean enoughFlour(int flourGrams)
    {
        int perfect = 650;

        if(flourGrams >= (perfect*.95) && flourGrams <= (perfect*1.05))
            return true;
        else
            return false;
    }

    public static boolean enoughYeast(int yeastGrams)
    {
        int perfect = 14;

        if(yeastGrams >=(perfect*.95) && yeastGrams <= (perfect*1.05))
            return true;
        else
            return false;
    }

    public static boolean enoughWarmWater(int warmWaterMl)
    {
        int perfect = 60;

        if(warmWaterMl >= (perfect*.95) && warmWaterMl <= (perfect*1.05))
            return true;
        else
            return false;
    }

    public static boolean enoughMilk(int milkMl)
    {
        int perfect =350;

        if(milkMl >= (perfect*.95) && milkMl <=(perfect*1.05))
            return true;
        else
            return false;
    }

    public static boolean enoughCastorSugar(int casterSugarGram)
    {
        int perfect = 100;

        if(casterSugarGram >= (perfect*.95) && casterSugarGram <= (perfect*1.05))
            return true;
        else
            return false;
    }

    public static boolean enoughButter(int butterGram)
    {
        int perfect = 70;

        if(butterGram >= (perfect*.95) && butterGram <= (perfect*1.05))
            return true;
        else
            return false;
    }

    public static boolean enoughAfterButter(int afterButterGrams)
    {
        int perfect = 70;

        if(afterButterGrams >= (perfect*.95) && afterButterGrams <= (perfect*1.05))
            return true;
        else
            return false;
    }

    public static boolean enoughVegetableOil(int vegetableOilMl)
    {
        int perfect = 1000;

        if(vegetableOilMl >= (perfect*.95) && vegetableOilMl <= (perfect*1.05))
            return true;
        else
            return false;
    }

    public static boolean enoughIcingSugar(int icingSugarGrams)
    {
        int perfect = 250;

        if(icingSugarGrams >= (perfect*.95) && icingSugarGrams <= (perfect*1.05))
            return true;
        else
            return true;
    }

    public static boolean enoughHotWater(int hotWaterMl)
    {
        int perfect = 60;

        if(hotWaterMl >= (perfect*.95) && hotWaterMl <= (perfect*1.05))
            return true;
        else
            return false;
    }

    public static boolean enoughVaniilaExtract(double vanillaExtractTeaSpoon)
    {
        double perfect = 1.5;

        if(vanillaExtractTeaSpoon >= (perfect*.95) && vanillaExtractTeaSpoon <= (perfect*1.05))
            return true;
        else
            return false;
    }
}
