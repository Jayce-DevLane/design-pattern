# 팩토리 메소드 패턴(Factory Method)

> * 구체적으로 어떤 인스턴스를 만들지는 서브 클래스가 정한다.
> * 다양한 구현체 (Product)가 있고, 그 중에서 특정한 구현체를 만들 수 있는 다양한 팩토리(Creator)를 제공할 수 있다.

아래 그림은 푸시 발송 엔진을 구현하면서 iOS, Android에 따른 앱(Product) 생성을 하기 위해 적용한 디자인 패턴이다. </br>
Creator AppFactory를 인터페이스로 정의하고 DefaultAppFactory를 추상 클래스로 받아 
그 하위 팩토리에서 자신을 특정한 구현체를 (Apns(iOS), Fcm(Android))를 별도로 구현하는 팩토리를 구상한다.
그리고 Product 또한 App을 추상클래스로 구성하고 그 하위 객체들을 상속받아 생성하여 구조를 잡았다.


> 클래스 다이어그램 그림 참조
> 
![FactoryMethod](/image/factoryMethod1.png)
