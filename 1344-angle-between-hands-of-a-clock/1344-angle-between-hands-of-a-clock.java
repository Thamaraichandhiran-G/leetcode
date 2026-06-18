class Solution {
    public double angleClock(int hour, int min) {
        double hangle  = (hour%12)*30 + min*0.5;

        double mangle = min*6;

        double diff = Math.abs(hangle-mangle);

        return Math.min(diff,360-diff);
    }
}