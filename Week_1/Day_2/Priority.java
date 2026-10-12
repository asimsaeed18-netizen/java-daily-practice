//day 2 exercise 7
package com.example.week_1.day_2;

public enum Priority {

    LOW("Low", 1),
    MEDIUM("Medium", 2),
    HIGH("High", 3);

    private final String label;
    private final int weight;

    // Constructor
    Priority(String label, int weight) {
        this.label = label;
        this.weight = weight;
    }

    // Return the label
    public String getLabel() {
        return label;
    }

    // Return the numeric weight
    public int getWeight() {
        return weight;
    }
}