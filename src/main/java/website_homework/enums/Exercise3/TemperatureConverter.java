package website_homework.enums.Exercise3;

public enum TemperatureConverter {
    C_F("C", "F", tempIn -> tempIn * 1.8f + 32),
    C_K("C", "K", tempIn -> tempIn + 273.15f),
    K_C("K", "C", tempIn -> tempIn - 273.15f),
    F_C("F", "C", tempIn -> (tempIn - 32)/ 1.8f),
    F_K("F", "K", tempIn -> ((tempIn -32)/1.8f) + 273.15f),
    K_F("K", "F", tempIn -> (tempIn - 273.15f) * 1.8f + 32);

    private String tempScaleInput;
    private String tempScaleOutput;
    private Converter converter;

    TemperatureConverter(String tempScaleInput, String tempScaleOutput, Converter converter) {
        this.tempScaleInput = tempScaleInput;
        this.tempScaleOutput = tempScaleOutput;
        this.converter = converter;
    }

    public String getTempScaleInput() {
        return tempScaleInput;
    }

    public String getTempScaleOutput() {
        return tempScaleOutput;
    }

    static float convertTemperature(String tempScaleIn, String tempScaleOut, float temp){
        for(TemperatureConverter temperatureConverter : values()){
            if(tempScaleIn == temperatureConverter.getTempScaleInput()
                    && tempScaleOut == temperatureConverter.getTempScaleOutput()){
                return temperatureConverter.converter.convert(temp);
            }
        }
        return 0;
    }
}
