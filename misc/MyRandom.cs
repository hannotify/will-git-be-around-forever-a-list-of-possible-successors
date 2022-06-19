// See https://aka.ms/new-console-template for more information
Console.WriteLine(PseudoRandom());

// static int Random() {
//     // chosen by fair dice roll; guaranteed to be random
//     return 2;
// }

static int PseudoRandom() {
    return new Random().Next(1, 6);
}
