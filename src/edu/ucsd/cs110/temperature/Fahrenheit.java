package edu.ucsd.cs110.temperature;

/**
 * Created by MSI USA on 2/15/2017.
 */
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float temp = getValue() - 32;
        temp = temp * ((float)5/(float)9);
        return new Celsius(temp);
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString()
    {
        // TODO: Complete this method
        return new String(String.valueOf(getValue())).concat(" F");
    }
}