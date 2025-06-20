public final class Slime extends Character {
    public Slime(String name,int hp){
        super(name, hp);
    }

    public void attack(Character target) {
        System.out.print(this.name + "は体当たり攻撃！");
        System.out.println(target.name +  "に5のダメージをあたえた！");
        target.hp -= 5;
    }
}
