import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      theme: ThemeData(primaryColor: Colors.blue),
      home: MyPage(),
    );
  }
}

class MyPage extends StatefulWidget {
  MyPage({Key key}) : super(key: key);

  @override
  _MyPageState createState() => _MyPageState();
}

class _MyPageState extends State<MyPage> {
  int contadorButao = 0;

  void _contar() {
    setState(() {
      contadorButao++;
      print(contadorButao);
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Contador cliques"),
        centerTitle: true,
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Text(
              '$contadorButao',
              style: TextStyle(
                fontSize: 35.0,
              ),
            ),
            ElevatedButton(
              child: Text('Adicionar'),
              onPressed: _contar,
              style: ButtonStyle(
                backgroundColor:
                    MaterialStateProperty.all<Color>(Colors.cyan[200]),
              ),
            ),
            ElevatedButton(
              child: Text('Subtrair'),
              onPressed: () {
                print('Todo');
                setState(() {
                  if (contadorButao == 0) {
                    ScaffoldMessenger.of(context).showSnackBar(const SnackBar(
                        content: Text('Impossível subtrair contagem de zero')));
                  } else {
                    contadorButao--;
                  }
                });
              },
              style: ButtonStyle(
                backgroundColor:
                    MaterialStateProperty.all<Color>(Colors.cyan[200]),
              ),
            ),
            ElevatedButton(
              child: Text('Resetar'),
              onPressed: () {
                setState(() {
                  contadorButao = 0;
                });
              },
              style: ButtonStyle(
                backgroundColor:
                    MaterialStateProperty.all<Color>(Colors.cyan[200]),
              ),
            ),
          ],
        ),
      ),
      // floatingActionButton: FloatingActionButton(
      // child: Text('Adicionar'),
      // onPressed: _contadorButao++,
      // ),
    );
  }
}
