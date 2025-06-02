package ch.bbw.ss;

import ch.bbw.ss.TestData.DataProvider;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        var data = DataProvider.GetData();
        System.out.println(data);
    }
}
