package com.binbo_kodakusan

import scala.util.Random

object Main {
  val A = 100.0

  def main(args: Array[String]): Unit = {
    Random.setSeed(1)

    var f = 1
    var i = 1
    var p = 0
    while (true) {
      // ランダムな点を選択
      val x = Random.nextDouble * A
      val y = Random.nextDouble * A
      // 円の中に入っているか判断する
      val r = Math.sqrt(Math.pow(x - A / 2, 2) + Math.pow(y - A / 2, 2))
      if (r <= A / 2)
        p = p + 1
      // 円周率を計算 & 出力
      val pi = p.toDouble * 4 / i
      if (f <= i) {
        println(s"count = $i, p = $p, r = $r, pi = $pi")
        f = f * 10
      }
      i = i + 1
    }
  }
}
