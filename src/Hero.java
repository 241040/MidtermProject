public class Hero extends Character{
    String weapon;

    public Hero(String name,int hp,String weapon){
        super(name, hp);
        this.weapon = weapon;
    }

    public void attack(Character target) {
        System.out.print(this.name + "は" + this.weapon + "で攻撃！");
        System.out.println(target.name + "に10のダメージをあたえた！");
        target.hp -= 10;
    }

    public void heal() {
        System.out.println(this.name + "は回復呪文を唱えた！HPが20回復した！");
        this.hp += 20;
    }
}
