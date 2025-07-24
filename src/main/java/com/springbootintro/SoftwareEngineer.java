package com.springbootintro;

import jakarta.persistence.*;

import java.util.Objects;


@Entity
public class SoftwareEngineer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String techStack;
    @Column(columnDefinition = "TEXT")
    private String learningPathRecommendations;

    public SoftwareEngineer(int id, String name, String techStack, String learningPathRecommendations) {
        this.id = id;
        this.name = name;
        this.techStack = techStack;
        this.learningPathRecommendations = learningPathRecommendations;
    }

    public SoftwareEngineer() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTechStack() {
        return techStack;
    }

    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }

    public String getLearningPathRecommendations() {
        return learningPathRecommendations;
    }

    public void setLearningPathRecommendations(String learningPathRecommendations) {
        this.learningPathRecommendations = learningPathRecommendations;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SoftwareEngineer that = (SoftwareEngineer) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(techStack, that.techStack) && Objects.equals(learningPathRecommendations, that.learningPathRecommendations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, techStack, learningPathRecommendations);
    }
}
