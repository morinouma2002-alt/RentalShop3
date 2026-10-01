
public class メモ {

	/*
	 * なぜ new しても中身が消えないのか
	
	new しているのは画面(メニュー)だけで、データは作り直していません。データは TopMenu が持っている次のオブジェクトにあり、メニューにはその参照(居場所)を渡しているだけです。
	
	Guest guest: 借りている DVD のリスト dvdSave や会員状態を持つ
	ZaikoKanri zaiko: DVD[] を持ち、各 DVD が rented を持つ
	
	new RentalMenu(zaiko, guest) は、
	同じ在庫と同じ客の参照をコピーして持つだけです。
	dvdSave.add(...) や dOne.rented() は本物のオブジェクトを書き換えるので、
	画面を捨てても結果は残ります。Search の map も毎回作り直されますが、中身は同じ DVD の参照です。
	
	つまり、画面は使い捨てで、状態は共有オブジェクトに置くという設計になっていて、これがうまくいっている理由です。
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
}
