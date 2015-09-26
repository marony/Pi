# モンテカルロ法(ランダムでシミュレーション)で円周率を求める

　1辺の長さがAの正方形の中に直径Aの円を置き、その正方形の中にランダムに点を打ちます。
　全体の試行回数とその点が円の中に入った回数を数え、円の中に入った回数 * 4 / 試行回数が円周率に収束していきます。

## 実行結果
    [info] Running com.binbo_kodakusan.Main
    count = 1, p = 1, r = 24.77704570854365, pi = 4.0
    count = 10, p = 7, r = 38.027051738555485, pi = 2.8
    count = 100, p = 80, r = 61.70498109988578, pi = 3.2
    count = 1000, p = 798, r = 39.11842259189012, pi = 3.192
    count = 10000, p = 7870, r = 15.843828731285056, pi = 3.148
    count = 100000, p = 78691, r = 27.53683669055565, pi = 3.14764
    count = 1000000, p = 786112, r = 42.521436340856184, pi = 3.144448
    count = 10000000, p = 7853975, r = 29.826612861901808, pi = 3.14159
    count = 100000000, p = 78534823, r = 25.48160968549292, pi = 3.14139292
    count = 1000000000, p = 785382604, r = 15.702741047756597, pi = 3.141530416

## 作業メモ
$ activator new Pi
4) minimal-scala

$ cd Pi
$ sbt run

$ mv src/main/scala/com/example src/main/scala/com/binbo-kodakusan
$ mv src/main/scala/com/binbo-kodakusan/Hello.scala src/main/scala/com/binbo-kodakusan/Main.scala

