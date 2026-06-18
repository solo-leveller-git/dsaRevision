class Solution {
    public double angleClock(int hour, int minutes) {
        double degreeForMinute = 6*minutes;
        double degreeForHour = 30*hour;
        double extraHour = 0.5*minutes;
        double angle = Math.abs(degreeForHour+extraHour-degreeForMinute);
        return Math.min(angle,360-angle);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna