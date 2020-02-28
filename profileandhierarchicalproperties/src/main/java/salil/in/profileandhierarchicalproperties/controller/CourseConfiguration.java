package salil.in.profileandhierarchicalproperties.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("course")
public class CourseConfiguration {
    private String name;

    private String chapterCount;

    private int rating;

    private String Author;


}