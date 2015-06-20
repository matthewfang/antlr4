package org.antlr.v4.test.runtime.csharp;

import org.junit.Test;
import org.junit.Ignore;

@SuppressWarnings("unused")
public class TestListeners extends BaseTest {

	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testTokenGetters_1() throws Exception {
		mkdir(tmpdir);
		StringBuilder grammarBuilder = new StringBuilder(801);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("@parser::header {\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("\n");
		grammarBuilder.append("@parser::members {\n");
		grammarBuilder.append("public class LeafListener : TBaseListener {\n");
		grammarBuilder.append("	public override void ExitA(TParser.AContext ctx) {\n");
		grammarBuilder.append("		if (ctx.ChildCount==2)\n");
		grammarBuilder.append("		{\n");
		grammarBuilder.append("			StringBuilder sb = new StringBuilder (\"[\");\n");
		grammarBuilder.append("			foreach (ITerminalNode node in ctx.INT ()) {\n");
		grammarBuilder.append("				sb.Append (node.ToString ());\n");
		grammarBuilder.append("				sb.Append (\", \");\n");
		grammarBuilder.append("			}\n");
		grammarBuilder.append("			sb.Length = sb.Length - 2;\n");
		grammarBuilder.append("			sb.Append (\"]\");\n");
		grammarBuilder.append("			Console.Write (\"{0} {1} {2}\", ctx.INT (0).Symbol.Text,\n");
		grammarBuilder.append("				ctx.INT (1).Symbol.Text, sb.ToString());\n");
		grammarBuilder.append("		}\n");
		grammarBuilder.append("		else\n");
		grammarBuilder.append("			Console.WriteLine(ctx.ID().Symbol);\n");
		grammarBuilder.append("	}\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("\n");
		grammarBuilder.append("s\n");
		grammarBuilder.append("@after {\n");
		grammarBuilder.append("Console.WriteLine($ctx.r.ToStringTree(this));\n");
		grammarBuilder.append("ParseTreeWalker walker = new ParseTreeWalker();\n");
		grammarBuilder.append("walker.Walk(new LeafListener(), $ctx.r);\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("  : r=a ;\n");
		grammarBuilder.append("a : INT INT\n");
		grammarBuilder.append("  | ID\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("MULT: '*' ;\n");
		grammarBuilder.append("ADD : '+' ;\n");
		grammarBuilder.append("INT : [0-9]+ ;\n");
		grammarBuilder.append("ID  : [a-z]+ ;\n");
		grammarBuilder.append("WS : [ \\t\\n]+ -> skip ;");
		String grammar = grammarBuilder.toString();
		String input ="1 2";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "s", input, false);
		assertEquals(
			"(a 1 2)\n" +
			"1 2 [1, 2]\n", found);
		assertNull(this.stderrDuringParse);

	}
	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testBasic() throws Exception {
		mkdir(tmpdir);
		StringBuilder grammarBuilder = new StringBuilder(458);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("@parser::header {\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("\n");
		grammarBuilder.append("@parser::members {\n");
		grammarBuilder.append("public class LeafListener : TBaseListener {\n");
		grammarBuilder.append("	public override void VisitTerminal(ITerminalNode node) {\n");
		grammarBuilder.append("		Console.WriteLine(node.Symbol.Text);\n");
		grammarBuilder.append("	}\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("\n");
		grammarBuilder.append("s\n");
		grammarBuilder.append("@after {\n");
		grammarBuilder.append("Console.WriteLine($ctx.r.ToStringTree(this));\n");
		grammarBuilder.append("ParseTreeWalker walker = new ParseTreeWalker();\n");
		grammarBuilder.append("walker.Walk(new LeafListener(), $ctx.r);\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("  : r=a ;\n");
		grammarBuilder.append("a : INT INT\n");
		grammarBuilder.append("  | ID\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("MULT: '*' ;\n");
		grammarBuilder.append("ADD : '+' ;\n");
		grammarBuilder.append("INT : [0-9]+ ;\n");
		grammarBuilder.append("ID  : [a-z]+ ;\n");
		grammarBuilder.append("WS : [ \\t\\n]+ -> skip ;");
		String grammar = grammarBuilder.toString();
		String input ="1 2";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "s", input, false);
		assertEquals(
			"(a 1 2)\n" +
			"1\n" +
			"2\n", found);
		assertNull(this.stderrDuringParse);

	}
	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testTokenGetters_2() throws Exception {
		mkdir(tmpdir);
		StringBuilder grammarBuilder = new StringBuilder(801);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("@parser::header {\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("\n");
		grammarBuilder.append("@parser::members {\n");
		grammarBuilder.append("public class LeafListener : TBaseListener {\n");
		grammarBuilder.append("	public override void ExitA(TParser.AContext ctx) {\n");
		grammarBuilder.append("		if (ctx.ChildCount==2)\n");
		grammarBuilder.append("		{\n");
		grammarBuilder.append("			StringBuilder sb = new StringBuilder (\"[\");\n");
		grammarBuilder.append("			foreach (ITerminalNode node in ctx.INT ()) {\n");
		grammarBuilder.append("				sb.Append (node.ToString ());\n");
		grammarBuilder.append("				sb.Append (\", \");\n");
		grammarBuilder.append("			}\n");
		grammarBuilder.append("			sb.Length = sb.Length - 2;\n");
		grammarBuilder.append("			sb.Append (\"]\");\n");
		grammarBuilder.append("			Console.Write (\"{0} {1} {2}\", ctx.INT (0).Symbol.Text,\n");
		grammarBuilder.append("				ctx.INT (1).Symbol.Text, sb.ToString());\n");
		grammarBuilder.append("		}\n");
		grammarBuilder.append("		else\n");
		grammarBuilder.append("			Console.WriteLine(ctx.ID().Symbol);\n");
		grammarBuilder.append("	}\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("\n");
		grammarBuilder.append("s\n");
		grammarBuilder.append("@after {\n");
		grammarBuilder.append("Console.WriteLine($ctx.r.ToStringTree(this));\n");
		grammarBuilder.append("ParseTreeWalker walker = new ParseTreeWalker();\n");
		grammarBuilder.append("walker.Walk(new LeafListener(), $ctx.r);\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("  : r=a ;\n");
		grammarBuilder.append("a : INT INT\n");
		grammarBuilder.append("  | ID\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("MULT: '*' ;\n");
		grammarBuilder.append("ADD : '+' ;\n");
		grammarBuilder.append("INT : [0-9]+ ;\n");
		grammarBuilder.append("ID  : [a-z]+ ;\n");
		grammarBuilder.append("WS : [ \\t\\n]+ -> skip ;");
		String grammar = grammarBuilder.toString();
		String input ="abc";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "s", input, false);
		assertEquals(
			"(a abc)\n" +
			"[@0,0:2='abc',<4>,1:0]\n", found);
		assertNull(this.stderrDuringParse);

	}
	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testLRWithLabels() throws Exception {
		mkdir(tmpdir);
		StringBuilder grammarBuilder = new StringBuilder(636);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("@parser::header {\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("\n");
		grammarBuilder.append("@parser::members {\n");
		grammarBuilder.append("public class LeafListener : TBaseListener {\n");
		grammarBuilder.append("	public override void ExitCall(TParser.CallContext ctx) {\n");
		grammarBuilder.append("		Console.Write(\"{0} {1}\",ctx.e().Start.Text,ctx.eList());\n");
		grammarBuilder.append("	}\n");
		grammarBuilder.append("	public override void ExitInt(TParser.IntContext ctx) {\n");
		grammarBuilder.append("		Console.WriteLine(ctx.INT().Symbol.Text);\n");
		grammarBuilder.append("	}\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("\n");
		grammarBuilder.append("s\n");
		grammarBuilder.append("@after {\n");
		grammarBuilder.append("Console.WriteLine($ctx.r.ToStringTree(this));\n");
		grammarBuilder.append("ParseTreeWalker walker = new ParseTreeWalker();\n");
		grammarBuilder.append("walker.Walk(new LeafListener(), $ctx.r);\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("  : r=e ;\n");
		grammarBuilder.append("e : e '(' eList ')' # Call\n");
		grammarBuilder.append("  | INT             # Int\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("eList : e (',' e)* ;\n");
		grammarBuilder.append("MULT: '*' ;\n");
		grammarBuilder.append("ADD : '+' ;\n");
		grammarBuilder.append("INT : [0-9]+ ;\n");
		grammarBuilder.append("ID  : [a-z]+ ;\n");
		grammarBuilder.append("WS : [ \\t\\n]+ -> skip ;");
		String grammar = grammarBuilder.toString();
		String input ="1(2,3)";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "s", input, false);
		assertEquals(
			"(e (e 1) ( (eList (e 2) , (e 3)) ))\n" +
			"1\n" +
			"2\n" +
			"3\n" +
			"1 [13 6]\n", found);
		assertNull(this.stderrDuringParse);

	}
	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testRuleGetters_1() throws Exception {
		mkdir(tmpdir);
		StringBuilder grammarBuilder = new StringBuilder(634);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("@parser::header {\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("\n");
		grammarBuilder.append("@parser::members {\n");
		grammarBuilder.append("public class LeafListener : TBaseListener {\n");
		grammarBuilder.append("	public override void ExitA(TParser.AContext ctx) {\n");
		grammarBuilder.append("		if (ctx.ChildCount==2) {\n");
		grammarBuilder.append("			Console.Write(\"{0} {1} {2}\",ctx.b(0).Start.Text,\n");
		grammarBuilder.append("				ctx.b(1).Start.Text,ctx.b()[0].Start.Text);\n");
		grammarBuilder.append("		} else\n");
		grammarBuilder.append("			Console.WriteLine(ctx.b(0).Start.Text);\n");
		grammarBuilder.append("	}\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("\n");
		grammarBuilder.append("s\n");
		grammarBuilder.append("@after {\n");
		grammarBuilder.append("Console.WriteLine($ctx.r.ToStringTree(this));\n");
		grammarBuilder.append("ParseTreeWalker walker = new ParseTreeWalker();\n");
		grammarBuilder.append("walker.Walk(new LeafListener(), $ctx.r);\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("  : r=a ;\n");
		grammarBuilder.append("a : b b		// forces list\n");
		grammarBuilder.append("  | b		// a list still\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("b : ID | INT;\n");
		grammarBuilder.append("MULT: '*' ;\n");
		grammarBuilder.append("ADD : '+' ;\n");
		grammarBuilder.append("INT : [0-9]+ ;\n");
		grammarBuilder.append("ID  : [a-z]+ ;\n");
		grammarBuilder.append("WS : [ \\t\\n]+ -> skip ;");
		String grammar = grammarBuilder.toString();
		String input ="1 2";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "s", input, false);
		assertEquals(
			"(a (b 1) (b 2))\n" +
			"1 2 1\n", found);
		assertNull(this.stderrDuringParse);

	}
	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testLR() throws Exception {
		mkdir(tmpdir);
		StringBuilder grammarBuilder = new StringBuilder(612);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("@parser::header {\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("\n");
		grammarBuilder.append("@parser::members {\n");
		grammarBuilder.append("public class LeafListener : TBaseListener {\n");
		grammarBuilder.append("	public override void ExitE(TParser.EContext ctx) {\n");
		grammarBuilder.append("		if (ctx.ChildCount==3) {\n");
		grammarBuilder.append("			Console.Write(\"{0} {1} {2}\\n\",ctx.e(0).Start.Text,\n");
		grammarBuilder.append("				ctx.e(1).Start.Text, ctx.e()[0].Start.Text);\n");
		grammarBuilder.append("		} else\n");
		grammarBuilder.append("			Console.WriteLine(ctx.INT().Symbol.Text);\n");
		grammarBuilder.append("	}\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("\n");
		grammarBuilder.append("s\n");
		grammarBuilder.append("@after {\n");
		grammarBuilder.append("Console.WriteLine($ctx.r.ToStringTree(this));\n");
		grammarBuilder.append("ParseTreeWalker walker = new ParseTreeWalker();\n");
		grammarBuilder.append("walker.Walk(new LeafListener(), $ctx.r);\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("	: r=e ;\n");
		grammarBuilder.append("e : e op='*' e\n");
		grammarBuilder.append("	| e op='+' e\n");
		grammarBuilder.append("	| INT\n");
		grammarBuilder.append("	;\n");
		grammarBuilder.append("MULT: '*' ;\n");
		grammarBuilder.append("ADD : '+' ;\n");
		grammarBuilder.append("INT : [0-9]+ ;\n");
		grammarBuilder.append("ID  : [a-z]+ ;\n");
		grammarBuilder.append("WS : [ \\t\\n]+ -> skip ;");
		String grammar = grammarBuilder.toString();
		String input ="1+2*3";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "s", input, false);
		assertEquals(
			"(e (e 1) + (e (e 2) * (e 3)))\n" +
			"1\n" +
			"2\n" +
			"3\n" +
			"2 3 2\n" +
			"1 2 1\n", found);
		assertNull(this.stderrDuringParse);

	}
	/* this file and method are generated, any edit will be overwritten by the next generation */
	@Test
	public void testRuleGetters_2() throws Exception {
		mkdir(tmpdir);
		StringBuilder grammarBuilder = new StringBuilder(634);
		grammarBuilder.append("grammar T;\n");
		grammarBuilder.append("@parser::header {\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("\n");
		grammarBuilder.append("@parser::members {\n");
		grammarBuilder.append("public class LeafListener : TBaseListener {\n");
		grammarBuilder.append("	public override void ExitA(TParser.AContext ctx) {\n");
		grammarBuilder.append("		if (ctx.ChildCount==2) {\n");
		grammarBuilder.append("			Console.Write(\"{0} {1} {2}\",ctx.b(0).Start.Text,\n");
		grammarBuilder.append("				ctx.b(1).Start.Text,ctx.b()[0].Start.Text);\n");
		grammarBuilder.append("		} else\n");
		grammarBuilder.append("			Console.WriteLine(ctx.b(0).Start.Text);\n");
		grammarBuilder.append("	}\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("\n");
		grammarBuilder.append("s\n");
		grammarBuilder.append("@after {\n");
		grammarBuilder.append("Console.WriteLine($ctx.r.ToStringTree(this));\n");
		grammarBuilder.append("ParseTreeWalker walker = new ParseTreeWalker();\n");
		grammarBuilder.append("walker.Walk(new LeafListener(), $ctx.r);\n");
		grammarBuilder.append("}\n");
		grammarBuilder.append("  : r=a ;\n");
		grammarBuilder.append("a : b b		// forces list\n");
		grammarBuilder.append("  | b		// a list still\n");
		grammarBuilder.append("  ;\n");
		grammarBuilder.append("b : ID | INT;\n");
		grammarBuilder.append("MULT: '*' ;\n");
		grammarBuilder.append("ADD : '+' ;\n");
		grammarBuilder.append("INT : [0-9]+ ;\n");
		grammarBuilder.append("ID  : [a-z]+ ;\n");
		grammarBuilder.append("WS : [ \\t\\n]+ -> skip ;");
		String grammar = grammarBuilder.toString();
		String input ="abc";
		String found = execParser("T.g4", grammar, "TParser", "TLexer", "s", input, false);
		assertEquals(
			"(a (b abc))\n" +
			"abc\n", found);
		assertNull(this.stderrDuringParse);

	}

}
