# Генератор словаря
# Описание
Есть исходный текст сообщения (неизвестный язык). Программа должна разбить текст на слова и отсортировать их в естесственном порядке.  
Пример входящих данных
```
String text = "Fsdfsdfsvv, vvvbnnnf sdd asddd sdd ssddd asddd";
```
Реализация
```
Function<String, List<String>> dictionary = text -> Stream.of(text.split(" "))
                .map(elem -> new String(elem).replaceAll("[^a-zA-Z ]", ""))
                .distinct()
                .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1))
                .sorted()
                .collect(Collectors.toList());
...
```

Вывод
```
[Asddd, Fsdfsdfsvv, Sdd, Ssddd, Vvvbnnnf]
```