package com.metehan.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.ConversationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;

// @ApplicationScoped  Bütün uygulama boyunca ve bütün kullanıcılar için çalışır. Sunucu kapatılınca durur.
// @RequestScoped      Bir istek boyunca çalışır. İstekten sonra cevap verir ve ölür
// @SessionScoped      Bir kullanıcı için yaşar ancak Logout olunca biter
// @Dependent          Bulunmuş olduğu yapı hangi Scopedeyse onu sağlıyor
//@ConversationScoped  Belli bir istek boyunca yaşar
// @SessionScoped      Bean yapısını bir instance olmasını sağlamak için kullanıyoruz
public class _00_Scoped {
}
