# [ByteLegend](https://bytelegend.com) Challenge of JavaIsland: Fix Bug with Integer Identity

<details open='true'>
<summary>English</summary>

## Fix Bug with Integer Identity

The intention of [src/main/java/com/bytelegend/Main.java](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/src/main/java/com/bytelegend/Main.java) `numberEquals` method is to check if two strings
contain same numbers, e.g. `a` is `1234`, `b` is `+1234`, `numberEquals(a,b)` should return `true`.
However there is a but in `numberEquals` method, please fix it so the program runs with output:

```
true
true
```

- You can accomplish this challenge via any way below:
  - Recommended for beginners: run `git clone https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity` to download the code,
    finish the challenge in your local IDE, then copy/paste/submit the answer in web editor.
    - If you don't know how, you can click [import project into IDEA](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/clone-and-import.md)/[import project into VSCode](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/clone-and-import-vscode.md).
    - Before submitting your code, you'd better run `mvn verify` locally to save time. Don't know how? See [verify locally in IDEA](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/run-mvn-verify-idea.md)/[verify locally in VSCode](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/run-mvn-verify-vscode.md).
  - Very unrecommended: you can [click here to download zipped code](https://codeload.github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/zip/refs/heads/main) if you don't like `git` operations.
  - Or: if you are confident enough to write code in web editor directly, go ahead.
  - Or: if you are familiar with GitHub, you can fork [the repo](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity), finish the challenge and create a pull request.
- The bot will check your PR and tell you if you accomplish the challenge.
- Go back to [ByteLegend](https://bytelegend.com) and continue your hero journey.

Good luck!

If you need any help, feel free to join the [Discord Community](https://discord.gg/35RreUUGWt) or contact us via [contact@bytelegend.com](mailto:contact@bytelegend.com).

**Note: we only allow you to modify the following files.
Any changes to files other than the following files will be rejected:**

- `src/main/java/com/bytelegend/Main.java`

</details>

<details>
<summary>简体中文</summary>

## 修复比较整数时的bug

[src/main/java/com/bytelegend/Main.java](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/src/main/java/com/bytelegend/Main.java)中的`numberEquals`方法的意图是判断两个字符串是否包含相同的数字，
例如`a`为`1234`，`b`为`+1234`，调用`numberEquals(a, b)`应当返回`true`。
但是`numberEquals`方法中有一个bug，请修复之，使得程序运行输出：

```
true
true
```

- 你可以使用以下任意一种方法完成挑战：
  - 初学者推荐：运行`git clone https://git.bytelegend.com/ByteLegendQuest/java-fix-bug-with-integer-identity`将代码下载到本地，在本地使用IDE调试完成后复制到网页编辑器里提交。
    - 如果你不知道怎么做，可以点击[导入IDEA](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/zh_hans/clone-and-import.md)/[导入VSCode](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/zh_hans/clone-and-import-vscode.md)。
    - 在提交之前，你最好先在本地运行`mvn verify`验证一下答案，以节约时间。不知道如何做？请查看[在IDEA中本地验证](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/zh_hans/run-mvn-verify-idea.md)/[在VSCode中本地验证](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/zh_hans/run-mvn-verify-vscode.md)。
  - 非常不推荐：如果你实在不喜欢`git`命令行操作，你可以[点击这里直接下载打包好的代码](https://ghcodeload.bytelegend.com/ByteLegendQuest/java-fix-bug-with-integer-identity/zip/refs/heads/main)。
  - 或者：如果你非常自信不需要下载代码到本地调试，可以使用网页编辑器直接提交。
  - 或者：如果你对GitHub非常熟悉，你可以fork[这个仓库](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity)、完成挑战后，创建一个Pull Request。
- 机器人将会检查你的答案，告诉你你是否通过了挑战。
- 回到[字节传说](https://bytelegend.com)，然后继续你的英雄旅程。

祝你好运！

如果你需要任何帮助，欢迎加入官方玩家QQ群（在[首页](https://bytelegend.com)右下角的`联系 & 关于`菜单里可以找到入群方式）或者[Discord社区](https://discord.gg/PvmqK3hF)，或email至[contact@bytelegend.com](mailto:contact@bytelegend.com)。

**注意：我们只允许您修改以下文件，任何对其他文件的修改都会被拒绝：**

- `src/main/java/com/bytelegend/Main.java`

</details>

<details>
<summary>繁體中文</summary>

使用整數標識修復錯誤
----------

[src/main/java/com/bytelegend/Main.java](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/src/main/java/com/bytelegend/Main.java) `numberEquals`方法的目的是檢查兩個字符串是否包含相同的數字，例如`a`是`1234` ， `b`是`+1234` ， `numberEquals(a,b)`應該返回`true` 。但是有一個但在`numberEquals`方法中，請修復它以便程序運行並輸出：

    true
    true
    

-   您可以通過以下任何方式完成此挑戰：
    -   推薦給初學者：運行`git clone https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity`下載代碼，在本地IDE中完成挑戰，然後復制/粘貼/提交答案網頁編輯器。
        -   如果你不知道怎麼做，你可以點擊[import project into IDEA](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/clone-and-import.md) / [import project into VSCode](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/clone-and-import-vscode.md) 。
        -   在提交代碼之前，您最好在本地運行`mvn verify`以節省時間。不知道怎麼樣？請參閱[在 IDEA](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/run-mvn-verify-idea.md) [中進行本地驗證/在 VSCode 中進行本地驗證](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/run-mvn-verify-vscode.md)。
    -   非常不推薦：如果你不喜歡`git`操作，可以[點擊這裡下載壓縮代碼](https://codeload.github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/zip/refs/heads/main)。
    -   或者：如果您有足夠的信心直接在 Web 編輯器中編寫代碼，請繼續。
    -   或者：如果你熟悉 GitHub，你可以 fork[倉庫](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity)，完成挑戰並創建一個拉取請求。
-   機器人會檢查你的 PR 並告訴你是否完成了挑戰。
-   回到[ByteLegend](https://bytelegend.com)繼續你的英雄之旅。

祝你好運！

如果您需要任何幫助，請隨時加入[Discord 社區](https://discord.gg/35RreUUGWt)或通過[contact@bytelegend.com](mailto:contact@bytelegend.com)聯繫我們。

**注意：我們只允許您修改以下文件。對以下文件以外的文件的任何更改都將被拒絕：**

-   `src/main/java/com/bytelegend/Main.java`
</details>

<details>
<summary>Español</summary>

Arreglar error con identidad entera
-----------------------------------

La intención del método [src/main/java/com/bytelegend/Main.java](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/src/main/java/com/bytelegend/Main.java) `numberEquals` es verificar si dos cadenas contienen los mismos números, por ejemplo, `a` es `1234` , `b` es `+1234` , `numberEquals(a,b)` debe devolver `true` . Sin embargo, hay un método but in `numberEquals` , corríjalo para que el programa se ejecute con salida:

    true
    true
    

-   Puede lograr este desafío de cualquier manera a continuación:
    -   Recomendado para principiantes: ejecute `git clone https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity` para descargar el código, finalice el desafío en su IDE local, luego copie/pegue/envíe la respuesta en Editor web.
        -   Si no sabe cómo hacerlo, puede hacer clic en [importar proyecto a IDEA](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/clone-and-import.md) / [importar proyecto a VSCode](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/clone-and-import-vscode.md) .
        -   Antes de enviar su código, es mejor que ejecute `mvn verify` localmente para ahorrar tiempo. ¿No sabes cómo? Ver [verificar localmente en IDEA](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/run-mvn-verify-idea.md) / [verificar localmente en VSCode](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   Muy poco recomendado: puede [hacer clic aquí para descargar el código comprimido](https://codeload.github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/zip/refs/heads/main) si no le gustan las operaciones de `git` .
    -   O: si tiene la confianza suficiente para escribir código en el editor web directamente, adelante.
    -   O: si está familiarizado con GitHub, puede bifurcar [el repositorio](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity) , finalizar el desafío y crear una solicitud de extracción.
-   El bot verificará tu PR y te dirá si logras el desafío.
-   Regrese a [ByteLegend](https://bytelegend.com) y continúe su viaje de héroe.

¡Buena suerte!

Si necesita ayuda, no dude en unirse a la [comunidad de Discord](https://discord.gg/35RreUUGWt) o contáctenos a través de [contact@bytelegend.com](mailto:contact@bytelegend.com) .

**Nota: solo le permitimos modificar los siguientes archivos. Cualquier cambio en los archivos que no sean los siguientes archivos será rechazado:**

-   `src/main/java/com/bytelegend/Main.java`
</details>

<details>
<summary>العربية</summary>

إصلاح الخلل مع رقم صحيح
-----------------------

الغرض من أسلوب [src / main / java / com / bytelegend / Main.java](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/src/main/java/com/bytelegend/Main.java) `numberEquals` هو التحقق مما إذا كانت هناك سلسلتان تحتويان على نفس الأرقام ، على سبيل المثال `a` هي `1234` ، `b` هي `+1234` ، يجب أن تعود `numberEquals(a,b)` `true` . ومع ذلك ، هناك طريقة لكن في `numberEquals` ، يرجى إصلاحها حتى يعمل البرنامج مع الإخراج:

 `true true`

-   يمكنك إنجاز هذا التحدي بأي طريقة أدناه:
    -   يوصى به للمبتدئين: قم بتشغيل `git clone https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity` لتنزيل الكود ، وإنهاء التحدي في IDE المحلي الخاص بك ، ثم نسخ / لصق / إرسال الإجابة في محررشبكة.
        -   إذا كنت لا تعرف كيف يمكنك النقر فوق [استيراد مشروع إلى IDEA](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/clone-and-import.md) / [استيراد مشروع إلى VSCode](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/clone-and-import-vscode.md) .
        -   قبل إرسال التعليمات البرمجية الخاصة بك ، من الأفضل تشغيل `mvn verify` محليًا لتوفير الوقت. لا أعرف كيف؟ انظر [التحقق محليًا في IDEA](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/run-mvn-verify-idea.md) / [تحقق محليًا في VSCode](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   غير موصى به على الإطلاق: يمكنك [النقر هنا لتنزيل رمز مضغوط](https://codeload.github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/zip/refs/heads/main) إذا كنت لا تحب عمليات `git` .
    -   أو: إذا كنت واثقًا بدرجة كافية لكتابة التعليمات البرمجية في محرر الويب مباشرةً ، فابدأ.
    -   أو: إذا كنت معتادًا على GitHub ، فيمكنك تفرع [الريبو](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity) وإنهاء التحدي وإنشاء طلب سحب.
-   سيتحقق الروبوت من العلاقات العامة الخاصة بك ويخبرك إذا أنجزت التحدي.
-   ارجع إلى [ByteLegend وتابع](https://bytelegend.com) رحلة بطلك.

حظ سعيد!

إذا كنت بحاجة إلى أي مساعدة ، فلا تتردد في الانضمام إلى [مجتمع Discord](https://discord.gg/35RreUUGWt) أو الاتصال بنا عبر [contact@bytelegend.com](mailto:contact@bytelegend.com) .

**ملاحظة: نسمح لك فقط بتعديل الملفات التالية. سيتم رفض أي تغييرات يتم إجراؤها على الملفات بخلاف الملفات التالية:**

-   `src/main/java/com/bytelegend/Main.java`
</details>

<details>
<summary>Português</summary>

Corrigir Bug com Identidade Inteira
-----------------------------------

A intenção do método [src/main/java/com/bytelegend/Main.java](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/src/main/java/com/bytelegend/Main.java) `numberEquals` é verificar se duas strings contêm os mesmos números, por exemplo, `a` é `1234` , `b` é `+1234` , `numberEquals(a,b)` deve retornar `true` . No entanto, existe um método mas em `numberEquals` , corrija-o para que o programa seja executado com saída:

    true
    true
    

-   Você pode realizar esse desafio de qualquer maneira abaixo:
    -   Recomendado para iniciantes: execute `git clone https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity` para baixar o código, conclua o desafio em seu IDE local e copie/cole/envie a resposta em editor web.
        -   Se você não sabe como, você pode clicar em [importar projeto para IDEA](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/clone-and-import.md) / [importar projeto para VSCode](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/clone-and-import-vscode.md) .
        -   Antes de enviar seu código, é melhor você executar `mvn verify` localmente para economizar tempo. Não sei como? Consulte [verificar localmente em IDEA](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/run-mvn-verify-idea.md) / [verificar localmente em VSCode](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   Muito não recomendado: você pode [clicar aqui para baixar o código zipado](https://codeload.github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/zip/refs/heads/main) se não gostar das operações do `git` .
    -   Ou: se você estiver confiante o suficiente para escrever código diretamente no editor web, vá em frente.
    -   Ou: se você estiver familiarizado com o GitHub, você pode bifurcar [o repo](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity) , finalizar o desafio e criar um pull request.
-   O bot verificará seu PR e informará se você cumpriu o desafio.
-   Volte para [ByteLegend](https://bytelegend.com) e continue sua jornada de herói.

Boa sorte!

Se precisar de ajuda, sinta-se à vontade para se juntar à [Comunidade Discord](https://discord.gg/35RreUUGWt) ou entre em contato conosco via [contact@bytelegend.com](mailto:contact@bytelegend.com) .

**Nota: só permitimos que você modifique os seguintes arquivos. Quaisquer alterações em arquivos que não sejam os arquivos a seguir serão rejeitadas:**

-   `src/main/java/com/bytelegend/Main.java`
</details>

<details>
<summary>Bahasa Indonesia</summary>

Perbaiki Bug dengan Identitas Integer
-------------------------------------

Maksud dari metode [src/main/Java/com/bytelegend/Main.java](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/src/main/java/com/bytelegend/Main.java) `numberEquals` adalah untuk memeriksa apakah dua string berisi angka yang sama, misalnya `a` adalah `1234` , `b` adalah `+1234` , `numberEquals(a,b)` harus mengembalikan `true` . Namun ada tetapi dalam metode `numberEquals` , tolong perbaiki agar program berjalan dengan output:

    true
    true
    

-   Anda dapat menyelesaikan tantangan ini melalui cara apa pun di bawah ini:
    -   Direkomendasikan untuk pemula: jalankan `git clone https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity` untuk mengunduh kode, selesaikan tantangan di IDE lokal Anda, lalu salin/tempel/kirim jawabannya di editor web.
        -   Jika Anda tidak tahu caranya, Anda bisa mengklik [import project into IDEA](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/clone-and-import.md) / [import project into VSCode](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/clone-and-import-vscode.md) .
        -   Sebelum mengirimkan kode Anda, Anda sebaiknya menjalankan `mvn verify` secara lokal untuk menghemat waktu. Tidak tahu bagaimana? Lihat [verifikasi secara lokal di IDEA](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/run-mvn-verify-idea.md) / [verifikasi secara lokal di VSCode](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   Sangat tidak direkomendasikan: Anda dapat [mengklik di sini untuk mengunduh kode zip](https://codeload.github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/zip/refs/heads/main) jika Anda tidak menyukai operasi `git` .
    -   Atau: jika Anda cukup percaya diri untuk menulis kode di editor web secara langsung, silakan.
    -   Atau: jika Anda terbiasa dengan GitHub, Anda dapat melakukan fork [repo](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity) , menyelesaikan tantangan, dan membuat permintaan tarik.
-   Bot akan memeriksa PR Anda dan memberi tahu Anda jika Anda menyelesaikan tantangan.
-   Kembali ke [ByteLegend](https://bytelegend.com) dan lanjutkan perjalanan pahlawan Anda.

Semoga beruntung!

Jika Anda memerlukan bantuan, jangan ragu untuk bergabung dengan [Komunitas Discord](https://discord.gg/35RreUUGWt) atau hubungi kami melalui [contact@bytelegend.com](mailto:contact@bytelegend.com) .

**Catatan: kami hanya mengizinkan Anda untuk mengubah file berikut. Setiap perubahan pada file selain file berikut akan ditolak:**

-   `src/main/java/com/bytelegend/Main.java`
</details>

<details>
<summary>Français</summary>

Correction d'un bogue avec l'identité entière
---------------------------------------------

L'intention de la méthode [src/main/java/com/bytelegend/Main.java](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/src/main/java/com/bytelegend/Main.java) `numberEquals` est de vérifier si deux chaînes contiennent les mêmes nombres, par exemple `a` est `1234` , `b` est `+1234` , `numberEquals(a,b)` doit renvoyer `true` . Cependant, il existe une méthode but in `numberEquals` , veuillez la corriger afin que le programme s'exécute avec la sortie :

    true
    true
    

-   Vous pouvez accomplir ce défi de n'importe quelle manière ci-dessous:
    -   Recommandé pour les débutants : exécutez `git clone https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity` pour télécharger le code, terminez le défi dans votre IDE local, puis copiez/collez/soumettez la réponse dans éditeur web.
        -   Si vous ne savez pas comment, vous pouvez cliquer sur [importer le projet dans IDEA](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/clone-and-import.md) / [importer le projet dans VSCode](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/clone-and-import-vscode.md) .
        -   Avant de soumettre votre code, vous feriez mieux d'exécuter `mvn verify` localement pour gagner du temps. Vous ne savez pas comment ? Voir [vérifier localement dans IDEA](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/run-mvn-verify-idea.md) / [vérifier localement dans VSCode](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   Très déconseillé : vous pouvez [cliquer ici pour télécharger le code compressé](https://codeload.github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/zip/refs/heads/main) si vous n'aimez pas les opérations `git` .
    -   Ou : si vous êtes suffisamment confiant pour écrire du code directement dans l'éditeur Web, continuez.
    -   Ou : si vous êtes familier avec GitHub, vous pouvez forker [le dépôt](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity) , terminer le défi et créer une demande d'extraction.
-   Le bot vérifiera votre PR et vous dira si vous accomplissez le défi.
-   Retournez à [ByteLegend](https://bytelegend.com) et continuez votre voyage de héros.

Bonne chance!

Si vous avez besoin d'aide, n'hésitez pas à rejoindre la [communauté Discord](https://discord.gg/35RreUUGWt) ou à nous contacter via [contact@bytelegend.com](mailto:contact@bytelegend.com) .

**Remarque : nous vous autorisons uniquement à modifier les fichiers suivants. Toute modification de fichiers autres que les fichiers suivants sera rejetée :**

-   `src/main/java/com/bytelegend/Main.java`
</details>

<details>
<summary>日本語</summary>

整数IDのバグを修正
----------

[src / main / java / com / bytelegend / Main.java](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/src/main/java/com/bytelegend/Main.java) `numberEquals`メソッドの目的は、2つの文字列に同じ数値が含まれているかどうかを確認することです。たとえば`a`は`1234` 、 `b`は+1234、 `+1234` `numberEquals(a,b)`は`true`を返す必要があります。ただし、 `numberEquals`メソッドがありますが、プログラムが出力で実行されるように修正してください。

    true
    true
    

-   この課題は、以下のいずれかの方法で達成できます。
    -   初心者に推奨： `git clone https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity`を実行してコードをダウンロードし、ローカルIDEでチャレンジを完了してから、で回答をコピー/貼り付け/送信します。 Webエディター。
        -   方法がわからない場合は、\[ [プロジェクトをIDEAにインポート](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/clone-and-import.md)\]/\[ [プロジェクトをVSCodeにインポート](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/clone-and-import-vscode.md)\]をクリックできます。
        -   コードを送信する前に、時間を節約するためにローカルで`mvn verify`実行することをお勧めします。方法がわかりませんか？ [IDEAでローカルに](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/run-mvn-verify-idea.md)[検証する/VSCodeでローカルに](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/run-mvn-verify-vscode.md)検証するを参照してください。
    -   非常に推奨されていません`git`操作が気に入らない場合は、 [ここをクリックしてzipコードをダウンロード](https://codeload.github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/zip/refs/heads/main)できます。
    -   または：Webエディターで直接コードを記述できる自信がある場合は、先に進んでください。
    -   または：GitHubに精通している場合は[、リポジトリ](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity)をフォークしてチャレンジを終了し、プルリクエストを作成できます。
-   ボットはPRをチェックし、チャレンジを達成したかどうかを通知します。
-   [ByteLegend](https://bytelegend.com)に戻り、ヒーローの旅を続けてください。

幸運を！

ヘルプが必要な場合は、 [Discordコミュニティ](https://discord.gg/35RreUUGWt)に参加するか、contact [@bytelegend.com](mailto:contact@bytelegend.com)からお問い合わせください。

**注：変更できるのは次のファイルのみです。次のファイル以外のファイルへの変更は拒否されます。**

-   `src/main/java/com/bytelegend/Main.java`
</details>

<details>
<summary>Русский</summary>

Исправить ошибку с целочисленным идентификатором
------------------------------------------------

Назначение метода [src/main/java/com/bytelegend/Main.java](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/src/main/java/com/bytelegend/Main.java) `numberEquals` состоит в том, чтобы проверить, содержат ли две строки одинаковые числа, например, `a` равно `1234` , `b` равно `+1234` , `numberEquals(a,b)` должно возвращать `true` . Однако есть но в методе `numberEquals` , пожалуйста, исправьте его, чтобы программа работала с выводом:

    true
    true
    

-   Вы можете выполнить эту задачу любым способом, указанным ниже:
    -   Рекомендуется для начинающих: запустите `git clone https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity` , чтобы загрузить код, выполните задание в локальной среде IDE, затем скопируйте/вставьте/отправьте ответ в веб-редактор.
        -   Если вы не знаете как, вы можете нажать [импортировать проект в IDEA](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/clone-and-import.md) / [импортировать проект в VSCode](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/clone-and-import-vscode.md) .
        -   Перед отправкой кода вам лучше запустить `mvn verify` локально, чтобы сэкономить время. Не знаете как? См. « [Проверить локально в IDEA](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/run-mvn-verify-idea.md) / [проверить локально в VSCode»](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   Крайне не рекомендуется: вы можете [нажать здесь, чтобы загрузить заархивированный код](https://codeload.github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/zip/refs/heads/main) , если вам не нравятся операции `git` .
    -   Или: если вы достаточно уверены, чтобы писать код напрямую в веб-редакторе, вперед.
    -   Или: если вы знакомы с GitHub, вы можете разветвить [репозиторий](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity) , выполнить задание и создать запрос на включение.
-   Бот проверит ваш PR и сообщит, выполнили ли вы задание.
-   Вернитесь в [ByteLegend](https://bytelegend.com) и продолжайте свое героическое путешествие.

Удачи!

Если вам нужна помощь, присоединяйтесь к [сообществу Discord](https://discord.gg/35RreUUGWt) или свяжитесь с нами по [адресу contact@bytelegend.com](mailto:contact@bytelegend.com) .

**Примечание: мы разрешаем вам изменять только следующие файлы. Любые изменения в файлах, кроме следующих файлов, будут отклонены:**

-   `src/main/java/com/bytelegend/Main.java`
</details>

<details>
<summary>Deutsch</summary>

Fehler mit ganzzahliger Identität behoben
-----------------------------------------

Die Methode [src/main/java/com/bytelegend/Main.java](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/src/main/java/com/bytelegend/Main.java) `numberEquals` soll prüfen, ob zwei Strings dieselben Zahlen enthalten, z. B. `a` ist `1234` , `b` ist `+1234` , `numberEquals(a,b)` sollte `true` zurückgeben. Es gibt jedoch eine but in `numberEquals` Methode, bitte korrigieren Sie sie, damit das Programm mit der Ausgabe ausgeführt wird:

    true
    true
    

-   Sie können diese Herausforderung auf eine der folgenden Arten meistern:
    -   Empfohlen für Anfänger: Führen Sie `git clone https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity` aus, um den Code herunterzuladen, beenden Sie die Herausforderung in Ihrer lokalen IDE und kopieren/fügen/senden Sie dann die Antwort ein Web-Editor.
        -   Wenn Sie nicht wissen wie, können Sie auf [Projekt in IDEA](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/clone-and-import.md) [importieren / Projekt in VSCode importieren klicken](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/clone-and-import-vscode.md) .
        -   Bevor Sie Ihren Code einreichen, sollten Sie `mvn verify` besser lokal ausführen, um Zeit zu sparen. Sie wissen nicht wie? Siehe [Lokal verifizieren in IDEA](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/run-mvn-verify-idea.md) / [Lokal verifizieren in VSCode](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   Sehr nicht zu empfehlen: Sie können [hier klicken, um den gezippten Code herunterzuladen,](https://codeload.github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/zip/refs/heads/main) wenn Sie `git` -Operationen nicht mögen.
    -   Oder: Wenn Sie sicher genug sind, Code direkt im Web-Editor zu schreiben, fahren Sie fort.
    -   Oder: Wenn Sie mit GitHub vertraut sind, können Sie [das Repo forken](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity) , die Challenge beenden und einen Pull-Request erstellen.
-   Der Bot überprüft Ihre PR und teilt Ihnen mit, ob Sie die Herausforderung meistern.
-   Gehen Sie zurück zu [ByteLegend](https://bytelegend.com) und setzen Sie Ihre Heldenreise fort.

Viel Glück!

Wenn Sie Hilfe benötigen, können Sie sich gerne der [Discord Community](https://discord.gg/35RreUUGWt) anschließen oder uns über [contact@bytelegend.com kontaktieren](mailto:contact@bytelegend.com) .

**Hinweis: Wir erlauben Ihnen nur, die folgenden Dateien zu ändern. Alle Änderungen an anderen Dateien als den folgenden Dateien werden abgelehnt:**

-   `src/main/java/com/bytelegend/Main.java`
</details>

<details>
<summary>한국어</summary>

정수 ID로 버그 수정
------------

[src/main/java/com/bytelegend/Main.java](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/src/main/java/com/bytelegend/Main.java) `numberEquals` 메소드의 의도는 두 문자열에 동일한 숫자가 포함되어 있는지 확인하는 것입니다. 예를 들어 `a` 는 `1234` , `b` 는 `+1234` , `numberEquals(a,b)` 는 `true` 를 반환해야 합니다. 그러나 `numberEquals` 메소드에 프로그램이 출력과 함께 실행되도록 수정하십시오.

    true
    true
    

-   아래 방법을 통해 이 챌린지를 완료할 수 있습니다.
    -   초보자를 위한 권장 사항: `git clone https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity` 를 실행하여 코드를 다운로드하고 로컬 IDE에서 챌린지를 완료한 다음 답변을 복사/붙여넣기/제출합니다. 웹 에디터.
        -   방법을 모르는 경우 [프로젝트를 IDEA로](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/clone-and-import.md) [가져오기 / 프로젝트를 VSCode로 가져](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/clone-and-import-vscode.md) 오기를 클릭할 수 있습니다.
        -   코드를 제출하기 전에 시간을 절약하기 위해 로컬에서 `mvn verify` 를 실행하는 것이 좋습니다. 방법을 모르십니까? [IDEA에서 로컬로](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/run-mvn-verify-idea.md) [확인/VSCode에서 로컬로](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/run-mvn-verify-vscode.md) 확인을 참조하세요.
    -   매우 권장하지 않음: `git` 작업이 마음에 들지 않으면 [여기를 클릭하여 압축 코드를 다운로드](https://codeload.github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/zip/refs/heads/main) 할 수 있습니다.
    -   또는 웹 편집기에서 직접 코드를 작성할 만큼 자신이 있다면 계속 진행하십시오.
    -   또는 GitHub에 익숙하다면 리포지토리를 분기 [하고](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity) 챌린지를 완료하고 풀 요청을 생성할 수 있습니다.
-   봇은 PR을 확인하고 도전 과제를 달성했는지 알려줍니다.
-   [ByteLegend](https://bytelegend.com) 로 돌아가 영웅 여정을 계속하세요.

행운을 빕니다!

도움이 필요하면 언제든지 [Discord 커뮤니티](https://discord.gg/35RreUUGWt) 에 가입하거나 [contact@bytelegend.com](mailto:contact@bytelegend.com) 을 통해 문의하세요.

**참고: 다음 파일만 수정할 수 있습니다. 다음 파일 이외의 파일에 대한 변경 사항은 거부됩니다.**

-   `src/main/java/com/bytelegend/Main.java`
</details>

<details>
<summary>Italiano</summary>

Correzione di bug con identità intera
-------------------------------------

L'intenzione del metodo [src/main/java/com/bytelegend/Main.java](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/src/main/java/com/bytelegend/Main.java) `numberEquals` è controllare se due stringhe contengono gli stessi numeri, ad esempio `a` è `1234` , `b` è `+1234` , `numberEquals(a,b)` dovrebbe restituire `true` . Tuttavia esiste un metodo ma in `numberEquals` , correggilo in modo che il programma venga eseguito con l'output:

    true
    true
    

-   Puoi portare a termine questa sfida in qualsiasi modo di seguito:
    -   Consigliato per i principianti: esegui `git clone https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity` per scaricare il codice, completa la sfida nel tuo IDE locale, quindi copia/incolla/invia la risposta in editore web.
        -   Se non sai come fare, puoi fare clic su [importa progetto in IDEA](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/clone-and-import.md) / [importa progetto in VSCode](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/clone-and-import-vscode.md) .
        -   Prima di inviare il codice, è meglio eseguire `mvn verify` in locale per risparmiare tempo. Non sai come? Vedere [verifica in locale in IDEA](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/run-mvn-verify-idea.md) / [verifica in locale in VSCode](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   Molto sconsigliato: puoi fare [clic qui per scaricare il codice zippato](https://codeload.github.com/ByteLegendQuest/java-fix-bug-with-integer-identity/zip/refs/heads/main) se non ti piacciono le operazioni `git` .
    -   Oppure: se sei abbastanza sicuro da scrivere il codice direttamente nell'editor web, vai avanti.
    -   Oppure: se hai familiarità con GitHub, puoi eseguire il fork [del repository](https://github.com/ByteLegendQuest/java-fix-bug-with-integer-identity) , completare la sfida e creare una richiesta pull.
-   Il bot controllerà il tuo PR e ti dirà se hai superato la sfida.
-   Torna a [ByteLegend](https://bytelegend.com) e continua il tuo viaggio da eroe.

Buona fortuna!

Se hai bisogno di aiuto, non esitare a unirti alla [community di Discord](https://discord.gg/35RreUUGWt) o contattaci tramite [contact@bytelegend.com](mailto:contact@bytelegend.com) .

**Nota: ti permettiamo solo di modificare i seguenti file. Eventuali modifiche ai file diversi dai seguenti file verranno rifiutate:**

-   `src/main/java/com/bytelegend/Main.java`
</details>
