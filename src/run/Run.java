package run;

import java.time.LocalDateTime;

public class Run {
    double mileRun;
    int heartRate;
    int caloriesBurn;
    double speed;
    LocalDateTime startTime;
    LocalDateTime endTime;

    /**
     * 
     */
    public Run(){
        this.mileRun = 0.0;
        this.heartRate = 0;
        this.caloriesBurn = 0;
        this.speed = 0.0;
    }

    /**
     * 
     * @param mileRun
     * @param heartRate
     * @param caloriesBurn
     * @param speed
     * @param startTime
     * @param endTime
     */
    public Run(double mileRun, int heartRate, int caloriesBurn, double speed, LocalDateTime startTime, LocalDateTime endTime) {
        this.mileRun = mileRun;
        this.heartRate = heartRate;
        this.caloriesBurn = caloriesBurn;
        this.speed = speed;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    /**
     * 
     * @param go
     */
    public Run(Run go) {
        this.mileRun = go.mileRun;
        this.heartRate = go.heartRate;
        this.caloriesBurn = go.caloriesBurn;
        this.speed = go.speed;
        this.startTime = go.startTime;
        this.endTime = go.endTime;
    }

    public double getMileRun() {
        return mileRun;
    }

    public void setMileRun(double mileRun) {
        this.mileRun = mileRun;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getCaloriesBurn() {
        return caloriesBurn;
    }

    public void setCaloriesBurn(int caloriesBurn) {
        this.caloriesBurn = caloriesBurn;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Run [caloriesBurn=" + caloriesBurn + ", endTime=" + endTime + ", heartRate=" + heartRate + ", mileRun="
                + mileRun + ", speed=" + speed + ", startTime=" + startTime + "]";
    }

}