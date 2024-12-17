public class Main {
    public static void main(String[] args){
    //start coding
    }
}
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>روايات شروق الجندالي</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <header>
        <h1>روايات شروق الجندالي</h1>
        <p>استمتع بأفضل القصص والروايات الأدبية</p>
    </header>
    <main>
        <section id="novels">
            <h2>الروايات</h2>
            <div id="novel-list">
                <!-- الروايات ستظهر هنا -->
            </div>
        </section>
        <section id="add-novel">
            <h2>أضف رواية جديدة</h2>
            <form id="novel-form">
                <label for="title">عنوان الرواية:</label>
                <input type="text" id="title" name="title" required>
                <label for="content">محتوى الرواية:</label>
                <textarea id="content" name="content" rows="5" required></textarea>
                <button type="submit">إضافة</button>
            </form>
        </section>
    </main>
    <script src="script.js"></script>
</body>
</html>