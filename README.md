# سیستم پرداخت فروشگاه

این پروژه یک اپلیکیشن تجاری برای شبیه‌سازی انواع پرداخت توسط مشتریان است. کاربران می‌توانند از روش‌های مختلف برای پرداخت هزینه‌های خود استفاده کنند.

## ساختار کلی پروژه

پروژه شامل یک پکیج به نام `payment` است که شامل اجزای زیر می‌باشد:

- `PaymentStrategy` (اینترفیس) - تعریف روش‌های پرداخت.
- `CreditCardPayment` (کلاس) - پیاده‌سازی پرداخت با کارت اعتباری.
- `PayPalPayment` (کلاس) - پیاده‌سازی پرداخت با پی‌پال.
- `BitcoinPayment` (کلاس) - پیاده‌سازی پرداخت با بیت‌کوین.
- `Customer` (کلاس انتزاعی) - کلاس پایه مشتری.
- `RegularCustomer` (کلاس) - مشتری معمولی.
- `PremiumCustomer` (کلاس) - مشتری ویژه.

### اینترفیس `PaymentStrategy`
این اینترفیس شامل دو متد اصلی است:
- `void pay(double amount)`: پردازش پرداخت.
- `String getPaymentDetails()`: دریافت جزئیات پرداخت.

### کلاس `Customer`
کلاس مشتری دارای ویژگی‌های زیر است:
- `name`: نام مشتری.
- `paymentHistory`: لیست پرداخت‌های انجام‌شده.
- `displayCustomerInfo()`: نمایش اطلاعات مشتری.
- `makePayment(PaymentStrategy paymentStrategy, double amount)`: ثبت پرداخت.
- `showPaymentHistory()`: مشاهده تاریخچه پرداخت‌ها.

## نحوه اجرا

برای راه‌اندازی پروژه ابتدا مخزن را کلون کنید:
```sh
git clone https://github.com/SanjiPk/payment-system.git
```

سپس از محیط‌های توسعه مانند IntelliJ IDEA یا Eclipse برای اجرای پروژه استفاده کنید.
همچنین می‌توانید با دستورات زیر پروژه را کامپایل و اجرا کنید:
```sh
javac -d bin -sourcepath src src/Main.java
java -cp bin Main
```


