public class GameMaster {
    public static void main(String[] args) {
        //勇者を生成
        Hero h = new Hero("アベル",100,"銅の剣");

        //スライムを生成
        Slime s = new Slime("スライムA",30);

        System.out.println("冒険が始まる…！");

        //両者のステータスを表示
        h.showStatus();
        s.showStatus();

        //戦闘をシミュレート
        System.out.println("戦闘開始！");
        h.attack(s);
        s.showStatus();
        s.attack(h);
        h.showStatus();
        h.heal();
        h.showStatus();
        h.attack(s);
        h.attack(s);
        h.attack(s);
        System.out.println("---戦闘終了---");

        //両者のステータスを再表示
        System.out.println("最終ステータス：");
        h.showStatus();
        s.showStatus();

        //両者の生存状況を表示
        System.out.println(h.name + "は生きている：" + h.isAlive());
        System.out.println(s.name + "は生きている：" + s.isAlive());

        //partyMember経由でHPを減らした後の勇者のステータスを表示
        System.out.println("---参照の確認---");
        Character partyMember = h;
        partyMember.hp -= 50;
        System.out.println("partyMember経由でHPを減らした後：");
        h.showStatus();
    }
}
