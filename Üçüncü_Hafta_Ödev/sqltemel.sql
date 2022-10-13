ans� standartlar�nda yaz�md�r bu oracle sql server falan heps�nde cal�s�r ve case insensitive yan� buyuk kucuk duyars�z b�r yaz�m vard�r
tek t�rnak kullan�l�r 'asdsad' g�b�

Select * from Customers -- Customers tablosunu �eker.
Select ContactName, CompanyName, City from Customers -- * yerine yaz�lan kolonlar� �eker.
Select ContactName Adi, CompanyName Sirket, City Sehir from Customers -- �stteki kod ile ayn� veriyi �eker ama isimlerini de�i�tirir.
Select * from Customers where City = 'london' -- Customers tablosunda, �ehri "London" olanlar� getirir. Where burada ko�ul i�in kullan�l�r.
Select * from Customers where City = 'Berlin'

Select * from products where categoryID = 1 or categoryid = 3 -- Products tablosunda kategorisi 1 ya da 3 olan �r�nler getirilir.
Select * from products where categoryID = 1 and UnitPrice >= 10 -- Products tablosunda kategorisi 1 ve 3 olan �r�nler ve ayn� zamanda fiyat� 10 ve �zeri olan �r�nler getirilir. 

Order by-- s�rala demek-- default hal� asc yan� artan  *****
SELECT * FROM Products order by productname -- Products tablosundaki t�m elemanlar� productname'de var olan isimlerin alfabetik s�ras�yla getirir.
SELECT * FROM Products order by categoryid
SELECT * FROM Products order by unitprice asc -- default olarak asc gelir yani artar s�rayla. "ASCENDING" ***
SELECT * FROM Products order by unitprice desc -- azalan s�rayla. "DECENDING" 00000

count-- adet demek -- kac tane oldugunu soyluyor
select count(*) Adet from products -- Products tablosundaki �r�nlerin say�s�.
select count(*) Adet from products where categoryid = 2 -- kategorisi 2 olan �r�nlerin say�s�.

select categoryid from products group by categoryid -- T�m kay�tl� kategorileri tekrar etmeden s�rala.
select categoryid, count(*) adet from products group by categoryid --Hangi kategoride ka� tane �r�n var?
select categoryid kategori, count(*) adet from products group by categoryid having count(*)<10 --10'dan az �r�n olan kategorileri verir. having  ekled� ve  kosulu g�rd�.

joinleri anlatacak- birle�tirmek i�in kulln�alna b�r kod 

select *
from products inner join Categories              -- products tablosundaki her �eyi al�r ve tablodaki kategori id ile kategoriler tablosunda e�le�en kategori bilgilerini �a��r�r. Tamam da bunu neye g�re getireyim dedi�in de **on** deriz yani durumunda �art�nda g�b�
on Products.categoryID = Categories.CategoryID

select Products.productid, products.productname, products.unitprice, categories.categoryname
from products inner join Categories              -- products tablosundaki �r�nlerin id, ismini ve fiyat�n� al�r ve tablodaki kategori id ile kategoriler tablosunda e�le�en kategori ismini �a��r�r.
on Products.categoryID = Categories.CategoryID

DTO--DATA TRANSFORMAT�ON OBJECT-- bu joinleri sonras�nda foreach la d�n�p kullan�c�ya g�stereceg�z yer� geld�g�nde  b�z bu jo�nle olusturudgumuz l�steyi sonras�nda for a dondurmem�s falan veri donusum nesnes� falan den�yormus.

-- inner join sadece iki tabloda e�le�en datay� getitir.****sadece eslesenn****
-- sql de kel�meler aras� bos b�rak�lmaz b�rak�l�rsa  k�seli parantezle yaz�lmas� gerekir a�a��da �rne�� mevcut 
select * from products p left join [Order Details] od
on p.productid = od.productid 

-- left join *** hem �k�s�nde ortak olup hem de yaz�ya gore solda olan yan� �lk yaz�lan tabloda olanlar� get�r demek
select * from products p left join [Order Details] od -- left --> solda olup sa�da olmayanlar� da getirir. �r�nlerde olup sat��� olmayanlar� getitir.
on p.productid = od.productid          -- listelenen �r�n say�s�nda de�i�im yoksa demek oluyor ki sipari� listesinde sat�lmayan �r�n yok.

select * from customers c left join orders o          -- burada inner olursa sipari� vermi� olan m��teriler gelir. left olursa sipari� vermeyenler de gelir.
on c.customerid = o.customerid
where o.customerid is null --Bu sat�r eklendi�inde sadece sipari� vermemi� olanlar yani solda olup sa�fa olmayan id'ler gelir.