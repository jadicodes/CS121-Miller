public class Pokemon {
    //instance variables
    private String name;
    private int hitPoints;
    private String move;
    private int movePower;
    private int attackSpeed;

    //constructors
    public Pokemon(String name, int hitPoints, String move, int movePower, int attackSpeed) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.move = move;
        this.movePower = movePower;
        this.attackSpeed = attackSpeed;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    public int getMovePower() {
        return movePower;
    }

    public void setMovePower(int movePower) {
        this.movePower = movePower;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    //displays Pokemon statistics as a formatted String
    public String displayPokemonStats() {
        String stats = "Name: " + name + "\n" +
                "Hit Points: " + hitPoints + "\n" +
                "Move: " + move + "\n" +
                "Move Power: " + movePower + "\n" +
                "Attack Speed: " + attackSpeed;
        return stats;
    }
}
