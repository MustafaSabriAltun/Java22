ansý standartlarýnda yazýmdýr bu oracle sql server falan hepsýnde calýsýr ve case insensitive yaný buyuk kucuk duyarsýz býr yazým vardýr
tek týrnak kullanýlýr 'asdsad' gýbý

Select * from Customers -- Customers tablosunu çeker.
Select ContactName, CompanyName, City from Customers -- * yerine yazýlan kolonlarý çeker.
Select ContactName Adi, CompanyName Sirket, City Sehir from Customers -- üstteki kod ile ayný veriyi çeker ama isimlerini deðiþtirir.
Select * from Customers where City = 'london' -- Customers tablosunda, þehri "London" olanlarý getirir. Where burada koþul için kullanýlýr.
Select * from Customers where City = 'Berlin'

Select * from products where categoryID = 1 or categoryid = 3 -- Products tablosunda kategorisi 1 ya da 3 olan ürünler getirilir.
Select * from products where categoryID = 1 and UnitPrice >= 10 -- Products tablosunda kategorisi 1 ve 3 olan ürünler ve ayný zamanda fiyatý 10 ve üzeri olan ürünler getirilir. 

Order by-- sýrala demek-- default halý asc yaný artan  *****
SELECT * FROM Products order by productname -- Products tablosundaki tüm elemanlarý productname'de var olan isimlerin alfabetik sýrasýyla getirir.
SELECT * FROM Products order by categoryid
SELECT * FROM Products order by unitprice asc -- default olarak asc gelir yani artar sýrayla. "ASCENDING" ***
SELECT * FROM Products order by unitprice desc -- azalan sýrayla. "DECENDING" 00000

count-- adet demek -- kac tane oldugunu soyluyor
select count(*) Adet from products -- Products tablosundaki ürünlerin sayýsý.
select count(*) Adet from products where categoryid = 2 -- kategorisi 2 olan ürünlerin sayýsý.

select categoryid from products group by categoryid -- Tüm kayýtlý kategorileri tekrar etmeden sýrala.
select categoryid, count(*) adet from products group by categoryid --Hangi kategoride kaç tane ürün var?
select categoryid kategori, count(*) adet from products group by categoryid having count(*)<10 --10'dan az ürün olan kategorileri verir. having  ekledý ve  kosulu gýrdý.

joinleri anlatacak- birleþtirmek için kullnýalna býr kod 

select *
from products inner join Categories              -- products tablosundaki her þeyi alýr ve tablodaki kategori id ile kategoriler tablosunda eþleþen kategori bilgilerini çaðýrýr. Tamam da bunu neye göre getireyim dediðin de **on** deriz yani durumunda þartýnda gýbý
on Products.categoryID = Categories.CategoryID

select Products.productid, products.productname, products.unitprice, categories.categoryname
from products inner join Categories              -- products tablosundaki ürünlerin id, ismini ve fiyatýný alýr ve tablodaki kategori id ile kategoriler tablosunda eþleþen kategori ismini çaðýrýr.
on Products.categoryID = Categories.CategoryID

DTO--DATA TRANSFORMATÝON OBJECT-- bu joinleri sonrasýnda foreach la dönüp kullanýcýya gösterecegýz yerý geldýgýnde  býz bu joýnle olusturudgumuz lýsteyi sonrasýnda for a dondurmemýs falan veri donusum nesnesý falan denýyormus.

-- inner join sadece iki tabloda eþleþen datayý getitir.****sadece eslesenn****
-- sql de kelýmeler arasý bos býrakýlmaz býrakýlýrsa  köseli parantezle yazýlmasý gerekir aþaðýda örneðý mevcut 
select * from products p left join [Order Details] od
on p.productid = od.productid 

-- left join *** hem ýkýsýnde ortak olup hem de yazýya gore solda olan yaný ýlk yazýlan tabloda olanlarý getýr demek
select * from products p left join [Order Details] od -- left --> solda olup saðda olmayanlarý da getirir. ürünlerde olup satýþý olmayanlarý getitir.
on p.productid = od.productid          -- listelenen ürün sayýsýnda deðiþim yoksa demek oluyor ki sipariþ listesinde satýlmayan ürün yok.

select * from customers c left join orders o          -- burada inner olursa sipariþ vermiþ olan müþteriler gelir. left olursa sipariþ vermeyenler de gelir.
on c.customerid = o.customerid
where o.customerid is null --Bu satýr eklendiðinde sadece sipariþ vermemiþ olanlar yani solda olup saðfa olmayan id'ler gelir.