package com.springdemo.mvc;


import org.springframework.lang.NonNull;

import java.util.LinkedHashMap;
import java.util.List;

//Getter & setter name consistency is important!!!!!
public class Student {

    private String name;
    private String lastName;

    private String country;

    private LinkedHashMap<String, String> languageOptions;

    private String favoriteLanguage;

    private LinkedHashMap<String, String> countryOptions;

    private LinkedHashMap<String, String> operatingSystemOptions;

    private List<String> operatingSystems;

    public Student(){
        this.countryOptions = new LinkedHashMap<>();

        this.countryOptions.put("CA","Canada");
        this.countryOptions.put("DE","Germany");
        this.countryOptions.put("NL","NetherLand");
        this.countryOptions.put("US","USA");

        this.languageOptions = new LinkedHashMap<>();

        this.languageOptions.put("Java","Java");
        this.languageOptions.put("C++","C++");
        this.languageOptions.put("Python","Python");
        this.languageOptions.put("JavaScript","JavaScript");

        this.operatingSystemOptions = new LinkedHashMap<>();
        this.operatingSystemOptions.put("Linux","Linux");
        this.operatingSystemOptions.put("Windows","Windows++");
        this.operatingSystemOptions.put("MacOS","MacOS");
    }

    public LinkedHashMap<String, String> getOperatingSystemOptions() {
        return operatingSystemOptions;
    }

    public void setOperatingSystemOptions(LinkedHashMap<String, String> operatingSystemOptions) {
        this.operatingSystemOptions = operatingSystemOptions;
    }

    public List<String> getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(List<String> operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

    public LinkedHashMap<String, String> getLanguageOptions() {
        return languageOptions;
    }

    public void setLanguageOptions(LinkedHashMap<String, String> languageOptions) {
        this.languageOptions = languageOptions;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
        this.countryOptions = countryOptions;
    }

    public String getCountry() {
        return this.countryOptions.get(country);
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFavoriteLanguage() {
        return this.languageOptions.get(favoriteLanguage);
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }
}
