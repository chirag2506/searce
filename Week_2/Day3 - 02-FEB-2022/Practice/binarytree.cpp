#include <iostream>
#include <queue>
using namespace std;

struct Node{
    int data;
    Node* left;
    Node* right;
};

class BinaryTree{
    public:
        BinaryTree();
        void insert(int val);
	    void inorderTraversal();
	    void postorderTraversal();
	    void preorderTraversal();

    private:
        void inorderTraversal(Node *node);
	    void postorderTraversal(Node *node);
	    void preorderTraversal(Node *node);
        Node *root;
};

BinaryTree::BinaryTree(){
	root = NULL;
};

void BinaryTree::insert(int val){
    if(root != NULL){
		queue<Node*> q;
        q.push(root);

        while (!q.empty()) {
            Node* temp = q.front();
            q.pop();
 
            if (temp->left != NULL)
                q.push(temp->left);
            else {
                temp->left = new Node;
                temp->left->data = val;
			    temp->left->left = NULL;
			    temp->left->right = NULL;
                return;
            }
    
            if (temp->right != NULL)
                q.push(temp->right);
            else {
                temp->right = new Node;
                temp->right->data = val;
			    temp->right->left = NULL;
			    temp->right->right = NULL;
                return;
            }
        }
	}else{
		root = new Node;
		root->data = val;
		root->left = NULL;
		root->right = NULL;
	}
}


void BinaryTree::inorderTraversal(Node *node){
    if(node != NULL){
        inorderTraversal(node->left);
		cout << node->data << ",";
		inorderTraversal(node->right);
    }
}

void BinaryTree::inorderTraversal(){
    inorderTraversal(root);
}

void BinaryTree::preorderTraversal(Node *node){
    if(node != NULL){
        cout << node->data << ",";
        preorderTraversal(node->left);
		preorderTraversal(node->right);
    }
}

void BinaryTree::preorderTraversal(){
    preorderTraversal(root);
}

void BinaryTree::postorderTraversal(Node *node){
    if(node != NULL){
        postorderTraversal(node->left);
		postorderTraversal(node->right);
		cout << node->data << ",";
    }
}

void BinaryTree::postorderTraversal(){
    postorderTraversal(root);
}

int main(){
    BinaryTree *tree = new BinaryTree();

	tree->insert(1);
	tree->insert(2);
	tree->insert(3);
	tree->insert(4);
	tree->insert(5);
	tree->insert(6);
	tree->insert(7);

    cout<<"Inorder Traversal:\t";
    tree->inorderTraversal();
    cout<<"\n";
    cout<<"Preorder Traversal:\t";
    tree->preorderTraversal();
    cout<<"\n";
    cout<<"Postorder Traversal:\t";
    tree->postorderTraversal();
    cout<<"\n";

    return 0;
}