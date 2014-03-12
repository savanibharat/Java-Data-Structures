package com.ArrayOperations;

public class ALeftMostElementAtEachLevelTree {

}
/*
 * int visited = -1;
void LeftMostInEveryLevel (struct node *root, int level) {
     if (root != NULL) {
              if (level > visited) {
                        cout << "Level = " << level << ", Node = " << root->data << endl;
                        visited = level;
              }
              LeftMostInEveryLevel (root->left, level + 1);
              LeftMostInEveryLevel (root->right, level + 1);
     }
}
 */
