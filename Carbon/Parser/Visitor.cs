using Antlr4.Runtime.Misc;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ParserLib
{
    internal class Visitor: CarbonBaseVisitor<object>
    {
        public override object VisitStatement([NotNull] CarbonParser.StatementContext context)
        {
            Console.WriteLine($"ENTER STATEMENT: P={context.Parent}");
            return base.VisitStatement(context);
        }
    }
}
