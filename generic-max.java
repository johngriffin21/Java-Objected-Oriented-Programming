//Generic-Max

public class Test
{
// This class should contain a single method called max.
public static <TYPE> int max(Thing a, Thing b)
{
    if (a.value > b.value){
        return a.value;
    }
    else{
        return b.value;
    }
}
}