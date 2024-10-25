package com.example.demo;

public class Home {
  private String presentation;
  private String vision;
  private String goal;

  public Home(String presentation, String vision, String goal) {
    this.presentation = presentation;
    this.vision = vision;
    this.goal = goal;
  }

  public String getPresentation() {
    return presentation;
  }

  public String getVision() {
    return vision;
  }

  public String getGoal() {
    return goal;
  }
}
