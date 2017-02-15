package edu.ucsd.cs110.temperature;

/**
 * Created by MSI USA on 2/15/2017.
 */

public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float mult = (float) 9/ (float)5;
        float temp = this.getValue() * mult;
        return new Fahrenheit(temp + 32);
    }

    public String toString()
    {
        // TODO: Complete this method
        return new String(String.valueOf(getValue())).concat(" C");
    }
}
